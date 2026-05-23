package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.juli.logging.Log;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.*;

@Controller
public class MainController {


   @GetMapping("/main")
   public String main(){
       System.out.println("main");

       // 예외발생
       if(true) throw new IllegalArgumentException("IllegalArgumentException 예외 발생");

       return "main";
   }
    @GetMapping("/main2")
    public String main2(){

        // 예외발생
        if(true) throw new NullPointerException("NullPointerException 예외 발생");
        System.out.println("main2");
        return "main";
    }
    // 로컬
    // 특정 Controller 내에서 처리
    // 2가지 기능: View + Model
    // @ExceptionHandler  => 모든 오류 예외처리[
    // value를 통해 특정 오류만 예외처리 가능
    @ExceptionHandler(value = {IllegalArgumentException.class, NullPointerException.class})
    // public ModelAndView handleException(Exception ex, HttpServletRequest request){}
    public String handleException(Exception e, Model model){
       model.addAttribute("message",e.getMessage());
       return "error/error";    // error 폴더 안에 있는 파일임을 명시 해야 된다.
    }
}
