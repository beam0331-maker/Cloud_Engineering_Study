package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


   @GetMapping("/test")
   public String main(){
       System.out.println("test");

       // 예외발생
       if(true) throw new ArithmeticException("ArithmeticException 예외 발생");

       return "main";
   }


}
