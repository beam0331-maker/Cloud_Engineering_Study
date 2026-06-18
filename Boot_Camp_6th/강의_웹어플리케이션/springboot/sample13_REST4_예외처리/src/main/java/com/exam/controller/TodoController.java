package com.exam.controller;

import com.exam.ApiRespose.ApiResponse;
import com.exam.dto.TodoDTO;
import com.exam.exception.DuplicatedIDException;
import com.exam.exception.RecodNotFoundException;
import com.exam.service.TodoMybatisService;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@RestController
public class TodoController {

    TodoMybatisService service;

    public TodoController(TodoMybatisService service) {
        this.service = service;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }

    // 1. sample13 목록보기 ( select )
    /*
        ok(T) == ResponseEntity<T>
     */
    @GetMapping("/todos")
    public ResponseEntity<ApiResponse<List<TodoDTO>>> todos() {
        ApiResponse<List<TodoDTO>> result = ApiResponse.ok("list find success", service.findAll());

        return ResponseEntity.ok(result);
    }

    // 2. 특정 row 보기
    // GET http://localhost:8080/todos/1
    // GET http://localhost:8080/todos/2
    @GetMapping("/todos/{id}")
    public ResponseEntity<ApiResponse<TodoDTO>> todoById(@PathVariable int id) {
        TodoDTO dto = service.findById(id);
        if (dto == null) {
            //            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiResponse.fail(id+ " not found",dto));
            throw new RecodNotFoundException("ID Number[" + id + "] is not exist");
        } else {
            return ResponseEntity.ok(ApiResponse.ok(id + " find success", dto));
        }
    }

    // 3. todo 저장
    // 권장: 새롭게 생섣된 데이터를 반환함.
    // SOAP에서는 생성된 데이터를 화면으로 볼 수 있었음.
    // REST에서는 화면이 없기 때무넹 새롭게 새성된 데이터를 반환하여 클라이어트에 정보를 제공
    /*
    *   요청방법
       POST http://localhost:8080/todos
       {
          "id": 4,
          "name": "유관순,
          "job" :"Learn JPA"
       }
     */

    @PostMapping("/todos")
    public ResponseEntity<ApiResponse<TodoDTO>> addTodo(@RequestBody TodoDTO todoDTO) {


        /*
            중복저장 예외처리
            1. 전달된 id 값이 있는지 확인.
            2. 없으면 저장
               있으면 예외 발생: DuplicatedIDException.java
         */

        TodoDTO dto = service.findById(todoDTO.getId());
        if (dto == null) {
            int n = service.save(todoDTO);
        }else{
            throw new DuplicatedIDException("ID Number[" + todoDTO.getId() + "] is duplicated ID");
        }

        ApiResponse<TodoDTO> result = ApiResponse.ok("todo save success", todoDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                                  .path("/{id}")
                                                  .buildAndExpand(todoDTO.getId())
                                                  .toUri();
        return ResponseEntity.created(location)
                             .body(result);
    }

    // 4. todo 수정( 전체수정)
    /*
        목표 설정 => id로 결정
        http://localhost:8080/todos/4
        수정 내용 => name과 job
        {
            "name": "유관순2" ,
            "job": "Learn JPA2"
        }
     */
    @PutMapping("/todos/{id}")
    public ResponseEntity<ApiResponse<TodoDTO>> updateTodo(@PathVariable int id,
                                                           @RequestBody TodoDTO todoDTO) {

        todoDTO.setId(id);
        int n = service.updateById(todoDTO);
        ApiResponse<TodoDTO> result = ApiResponse.ok("update success", todoDTO);
        return ResponseEntity.ok(result);
    }


    // 5. todo삭제
    // delete http://localhost:8080/todos/4
    @DeleteMapping("/todos/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteTodo(@PathVariable int id) {
        int n = service.deleteById(id);
        return ResponseEntity.noContent()
                             .header("X-request-result", "deleted")
                             .build();
    }

}

