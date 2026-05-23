package com.exam.controller;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes(value = "user_info")
public class TodoController {

    TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo-list")
    public String todoList(Model model) {

       String userid = (String) model.getAttribute("user_info");
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
    public String todoAdd(@Valid @ModelAttribute(value = "dto") TodoDTO todoDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "todoAddForm";
        }

        // 로그인된 userid 얻기
        String userid = (String) model.getAttribute("user_info");
        todoDTO.setUserid(userid);
        int n = todoService.save(todoDTO);

        System.out.println(todoDTO);
        return "redirect:todo-list";
    }
    @GetMapping("/todo-delete")
    public String todoDeleteForm(Model model) {

        String userid = (String) model.getAttribute("user_info");
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
    public String todoUpdateForm(Model model) {
        String userid = (String) model.getAttribute("user_info");
        List<TodoDTO> todoList = todoService.findAll(userid);
        model.addAttribute("todoListFindAll", todoList);
        model.addAttribute("dto", new TodoDTO());
        return "todoUpdateForm";
    }

    @PostMapping("/todo-update")
    public String todoUpdate(@Valid @ModelAttribute("dto")  TodoDTO todoDTO, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "todoUpdateForm";
        }

        String userid = (String) model.getAttribute("user_info");
        todoDTO.setUserid(userid);
        todoService.updateById(todoDTO);

        return "redirect:todo-list";
    }


}
