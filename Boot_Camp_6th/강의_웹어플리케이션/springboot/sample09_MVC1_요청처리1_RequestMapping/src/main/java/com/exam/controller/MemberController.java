package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MemberController {

    // 화면 보여주는 요청
    // http://localhost:8080/memberForm
    @RequestMapping("/memberForm")  // GET 방식으로 요청됨
    public String memberForm(){
        System.out.println("memberForm");
        return "memberForm";
    }

    //1. GET 요청 처리하는 코드
//    @RequestMapping(value = "/member", method = RequestMethod.GET) // GET 방식으로 요청
    @GetMapping("/member")
    public String memberGET(){
        System.out.println("memberGET");
        return "memberForm";
    }

    //2. POST 요청 처리하는 코드
//    @RequestMapping(value = "/member", method = RequestMethod.POST) // POST 방식으로 요청
    @PostMapping("/member")
    public String memberPOST(){
        System.out.println("memberPOST");
        return "memberForm";
    }

}
