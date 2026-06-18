package com.exam.controller;

import com.exam.dto.TodoDTO;
import com.exam.security.CustomUserDetails;
import com.exam.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class TodoController {

    TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo-list")
    public String todoList(@AuthenticationPrincipal CustomUserDetails userDetails, Model model) {

//        String userid = (String) model.getAttribute("user_info");
        String userid = userDetails.getUsername();
        List<TodoDTO> todoList = todoService.findAll(userid);
        model.addAttribute("todoListFindAll", todoList);
        return "todoList";
    }

    @GetMapping("/todo-add")
    public String todoAddFrom(Model model) {
        model.addAttribute("dto", new TodoDTO());
        return "todoAddForm";
    }

    @PostMapping("/todo-add")
    public String todoAdd(@Valid @ModelAttribute(value = "dto") TodoDTO todoDTO,
                          BindingResult bindingResult,
                          @AuthenticationPrincipal CustomUserDetails userDetails,
                          Model model) {

        if(bindingResult.hasErrors()) {
            return "todoAddForm";
        }

        // 로그인된 userid 얻기
        String userid = userDetails.getUsername();
        todoDTO.setUserid(userid);
        int n = todoService.save(todoDTO);

        System.out.println(todoDTO);
        return "redirect:todo-list";
    }
    @GetMapping("/todo-delete")
    public String todoDeleteForm(@AuthenticationPrincipal CustomUserDetails userDetails,
                                 Model model) {

        String userid = userDetails.getUsername();
        List<TodoDTO> todoList = todoService.findAll(userid);
        model.addAttribute("todoListFindAll", todoList);

        return "todoDeleteForm";
    }

    @PostMapping("/todo-delete")
    public String todoDelete(@RequestParam int id){
        todoService.deleteById(id);
        return "redirect:todo-list";
    }

    @GetMapping("/todo-update")
    public String todoUpdateForm(@AuthenticationPrincipal CustomUserDetails userDetails,
                                 Model model) {
        String userid = userDetails.getUsername();
        List<TodoDTO> todoList = todoService.findAll(userid);
        model.addAttribute("todoListFindAll", todoList);
        model.addAttribute("dto", new TodoDTO());
        return "todoUpdateForm";
    }

    @PostMapping("/todo-update")
    public String todoUpdate(@AuthenticationPrincipal CustomUserDetails userDetails,
                             @Valid @ModelAttribute("dto")  TodoDTO todoDTO,
                             BindingResult bindingResult,
                             Model model) {

        if(bindingResult.hasErrors()) {
            return "todoUpdateForm";
        }

        String userid = userDetails.getUsername();
        todoDTO.setUserid(userid);
        todoService.updateById(todoDTO);

        return "redirect:todo-list";
    }


}
