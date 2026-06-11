package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
   gradlew clean bootJar

   docker build -t spring-env-demo .
   docker run -d --name env-app -p 8080:8080 spring-env-demo

   curl http://localhost:8080/env

   docker rm -f env-app
   # 실행 시 env 덮어쓰기

   docker run -d ^
  --name env-app ^
  -p 9090:9090 ^
  -e SERVER_PORT=9090 ^
  -e APP_MESSAGE="실행 시 전달한 메시지" ^
  -e SPRING_PROFILES_ACTIVE=dev ^
  spring-env-demo

   curl http://localhost:9090/env

   ///////////////////////////
     .env 버전
        # .env 파일 작성
        SERVER_PORT=9090
        APP_MESSAGE=env 파일에서 전달한 메시지
        SPRING_PROFILES_ACTIVE=dev
        APP_UPLOAD_DIR=/app/upload


       docker rm -f env-app
      docker run -d ^
       --name env-app ^
       -p 9090:9090 ^
       --env-file .env ^
       spring-env-demo
   //////////////////////////////
 */

@RestController
public class EnvController {

    @Value("${app.message}")
    private String message;

    @Value("${app.upload-dir}")
    private String uploadDir;

    private final Environment environment;

    public EnvController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/")
    public String home() {
        return "Spring Boot ENV Demo";
    }

    @GetMapping("/env")
    public Map<String, Object> env() {
        return Map.of(
                "message", message,
                "uploadDir", uploadDir,
                "activeProfiles", environment.getActiveProfiles()
        );
    }
}