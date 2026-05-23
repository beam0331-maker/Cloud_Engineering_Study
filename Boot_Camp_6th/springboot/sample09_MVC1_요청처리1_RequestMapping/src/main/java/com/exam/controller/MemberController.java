package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class HomeController2 {

    //http://localhost:8080/member/list
    @RequestMapping("/list")
    public String hello(){
        System.out.println("hello");
        return "main";
    }
    //http://localhost:8080/member/write
    @RequestMapping("/write")
    public String write(){
        System.out.println("write");
        return "main";
    }
}
