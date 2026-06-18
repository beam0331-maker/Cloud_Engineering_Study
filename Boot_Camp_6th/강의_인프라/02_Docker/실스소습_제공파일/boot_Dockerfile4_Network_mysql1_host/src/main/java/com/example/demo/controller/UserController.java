// EmpController.java
package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;

/*
   gradlew clean bootJar
   docker build -t spring-mysql-demo .
   docker run -d --name spring-mysql-app -p 8090:8090  spring-mysql-demo
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/users/{id}")
    public UserDTO retrieveUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/users")
    public List<UserDTO> retrieveAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public UserDTO createUser( @RequestBody UserDTO dto) {
        return userService.create(dto);
    }

    @PutMapping("/users/{id}")
    public UserDTO updateUser(@PathVariable("id") Long id, @RequestBody UserDTO dto) {
        return userService.update(id, dto);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }
}
