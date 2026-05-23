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
   public String aaa(){
       System.out.println("main");
       return "main";
   }

    @GetMapping("/forward")
    public String forward(Model model){
       model.addAttribute("userid","홍길동");
       System.out.println("forward");
       return "forward:main";
    }

    @GetMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("userid","홍길동2");
        System.out.println("redirect");
        return "redirect:main";
    }

    @GetMapping("/flash")
    public String flash(RedirectAttributes model){
        model.addFlashAttribute("userid","홍길동3");
        System.out.println("flash");
        return "redirect:main";
    }
}
