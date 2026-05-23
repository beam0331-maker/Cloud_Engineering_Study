package com.exam.controller;

import com.exam.dto.TodoDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {


    // 사용자 입력 화면 보기
    @GetMapping("/add-todo")
    public String showTodoPage(Model model) {

        // @PostMapping의 @ModelAttribute("xxx") 값과 반드시 일치해야됨.
        model.addAttribute("xxx", new TodoDTO());
        return "write"; //write.html
    }

    // 사용자 입력 처리
    @PostMapping("/add-todo")
    public String addTodo(@Valid @ModelAttribute("xxx") TodoDTO todoDTO,
                          BindingResult bindingResult){

        // 검증실패
        if(bindingResult.hasErrors()){
            return "write";
        }
        // 검증성공
        return "redirect:main"; // PRG패턴
    }

    // 성공했을때 보여줄 화면
    @GetMapping("/main")
    public String main(){
        return "main"; //main.html
    }
}
