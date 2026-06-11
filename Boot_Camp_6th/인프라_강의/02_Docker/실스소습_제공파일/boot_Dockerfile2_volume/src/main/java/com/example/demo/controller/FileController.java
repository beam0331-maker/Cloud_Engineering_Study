package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

/*
    gradlew clean build

    docker build -t spring-volume-demo .

    docker volume create spring_upload_volume

    docker run -d ^
  --name spring-volume-app ^
  -p 8080:8080 ^
  -v spring_upload_volume:/app/upload ^
  spring-volume-demo

  //////////////////////////////////////////////////
  Talend API Tester에서 파일 업로드 요청.
			( 업로드 디렉터리는 자동으로 생성됨.  윈도우: c:\\app\\upload 폴더가 자동 생성됨 )

			POST  http://localhost:8080/files/upload

			HEADES 에 아무것도 설정안함. ( 나중에 자동으로 Content-Type:  multipart/form-date로 설정됨.

			BODY 에서 반드시 Form 선택하고 Add form parameter 선택.
			name항목: file 입력
			Text|File 항목:  File 선택
			Choose a file.. 클릭하고 업로드할 파일 선택 > Send 요청. > 성공시 업로드 성공: RHDSetup.log 출력됨.

			c:\\app\\upload 폴더에 가서 업로드 파일 확인하자.
  ////////////////////////////////////////////////////////


   curl -F "file=@test.txt" http://localhost:8080/files/upload
   curl -F "file=@HELP.md" http://localhost:8080/files/upload

   curl http://localhost:8080/files

   http://localhost:8080/files/HELP.md

   docker stop spring-volume-app
   docker rm spring-volume-app

   # 다시 실행하고 확인
   docker run -d ^
  --name spring-volume-app ^
  -p 8080:8080 ^
  -v spring_upload_volume:/app/upload ^
  spring-volume-demo

  curl http://localhost:8080/files

 */
@RestController
@RequestMapping("/files")
public class FileController {

    private final Path uploadPath;

    public FileController(@Value("${app.upload-dir}") String uploadDir) throws Exception {
        this.uploadPath = Paths.get(uploadDir).toAbsolutePath().normalize();
        Path path =  Files.createDirectories(this.uploadPath);
        System.out.println("Save Path:" + path.toString());
    }

    // 파일 업로드
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            return "업로드할 파일이 없습니다.";
        }

        String fileName = file.getOriginalFilename();

        Path targetPath = uploadPath.resolve(fileName).normalize();

        file.transferTo(targetPath);

        return "업로드 성공: " + fileName;
    }

    // 파일 목록 조회
    @GetMapping
    public List<String> listFiles() throws Exception {
        return Files.list(uploadPath)
                .filter(Files::isRegularFile)
                .map(path -> path.getFileName().toString())
                .collect(Collectors.toList());
    }

    // 파일 다운로드
    @GetMapping("/{fileName}")
    public ResponseEntity<Resource> download(@PathVariable String fileName) throws MalformedURLException {
        Path filePath = uploadPath.resolve(fileName).normalize();

        Resource resource = new UrlResource(filePath.toUri());

        if (!resource.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}