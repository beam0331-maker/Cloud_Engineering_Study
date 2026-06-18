package com.exam.controller;

import com.exam.dto.TodoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
@Validated
public class TodoController {
    // 사용자 입력 화면 보기
    @GetMapping("/add-todo")
    public String showTodoPage() {

        return "write"; //write.html
    }

    // 사용자 입력 처리
    @PostMapping("/add-todo")
    public String addTodo(@NotBlank(message = "적어도 한글자 이상 입력.")
                          String userid,
                          @Size(min = 5, message = "최소 5글자 이상 입력.")
                          String description,
                          @NotNull @FutureOrPresent(message = "현재 날짜 또는 미래 날짜를 입력.")
                          LocalDate targetDate){
        // 검증실패: 예외가 발생 =============> @ControllerAdvice

        // 검증성공
        System.out.println(userid);
        System.out.println(description);
        System.out.println(targetDate);
        return "redirect:main"; // PRG패턴
    }

    // 성공했을때 보여줄 화면
    @GetMapping("/main")
    public String main(){
        return "main"; //main.html
    }
}
