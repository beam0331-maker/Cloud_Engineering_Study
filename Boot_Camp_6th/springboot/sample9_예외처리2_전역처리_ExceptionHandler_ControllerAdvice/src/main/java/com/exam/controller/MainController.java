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

}
