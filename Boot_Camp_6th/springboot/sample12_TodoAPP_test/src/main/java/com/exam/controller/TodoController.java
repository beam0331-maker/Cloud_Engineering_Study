package com.exam.controller;

import com.exam.dto.TodoDTO;
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
    public String todoList(@AuthenticationPrincipal(expression = "username") String userid,
                           Model model) {

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
    public String todoAdd(@AuthenticationPrincipal(expression = "username") String userid,
                          @Valid @ModelAttribute(value = "dto") TodoDTO todoDTO,
                          BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "todoAddForm";
        }

        // 로그인된 userid 얻기
        todoDTO.setUserid(userid);
        int n = todoService.save(todoDTO);

        System.out.println(todoDTO);
        return "redirect:todo-list";
    }
    @GetMapping("/todo-delete")
    public String todoDeleteForm(@AuthenticationPrincipal(expression = "username") String userid,
                                 Model model) {

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
    public String todoUpdateForm(@AuthenticationPrincipal(expression = "username") String userid,
                                 Model model) {

        List<TodoDTO> todoList = todoService.findAll(userid);
        model.addAttribute("todoListFindAll", todoList);
        model.addAttribute("dto", new TodoDTO());
        return "todoUpdateForm";
    }

    @PostMapping("/todo-update")
    public String todoUpdate(@AuthenticationPrincipal(expression = "username") String userid,
                             @Valid @ModelAttribute("dto")  TodoDTO todoDTO,
                             BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "todoUpdateForm";
        }


        todoDTO.setUserid(userid);
        todoService.updateById(todoDTO);

        return "redirect:todo-list";
    }


}
