package com.exam.controller;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoMybatisService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    TodoMybatisService service;
    public TodoController(TodoMybatisService service) {
        this.service = service;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Boot!";
    }

    // 1. sample13 목록보기 ( select )
    @GetMapping("/todos")
    public List<TodoDTO> todos(){

        return service.findAll();
    }

    // 2. 특정 row 보기
    // GET http://localhost:8080/todos/1
    // GET http://localhost:8080/todos/2
    @GetMapping("/todos/{id}")
//    public TodoDTO findById(@PathVariable("id") int id)
    public TodoDTO findById(@PathVariable int id){
        return service.findById(id);
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
    public TodoDTO addTodo(@RequestBody TodoDTO todoDTO){
        int n = service.save(todoDTO);
        return todoDTO;
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
    public TodoDTO updateTodo(@PathVariable int id,
                             @RequestBody TodoDTO todoDTO){
        todoDTO.setId(id);
        int n = service.updateById(todoDTO);
        return todoDTO;
    }

    // 5. todo삭제
    // delete http://localhost:8080/todos/4

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id){
        int n = service.deleteById(id);
    }

}
