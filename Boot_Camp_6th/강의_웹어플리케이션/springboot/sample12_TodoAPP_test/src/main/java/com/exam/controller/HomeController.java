package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String hom() {
        return "home";
    }
}
