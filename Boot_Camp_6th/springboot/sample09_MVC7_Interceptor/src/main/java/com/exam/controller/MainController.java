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
       return "main";
   }
    @GetMapping("/main2")
    public String main2(){
        System.out.println("main2");
        return "main";
    }

}
