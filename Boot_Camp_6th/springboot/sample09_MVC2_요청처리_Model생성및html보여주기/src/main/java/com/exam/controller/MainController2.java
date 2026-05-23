package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
// 세션에 저장하고자하는 key 설정
@SessionAttributes(names = {"bbb","ccc"})
public class MainController2 {

    // application scope에 저장
    @Autowired
    ServletContext application;

    @GetMapping("/session")
    public String main(Model model) {

        // requsets scope에 저장
        model.addAttribute("aaa", "홍길동1");

        // session scope에 저장
        model.addAttribute("bbb", "홍길동2");
        model.addAttribute("ccc", "홍길동3");

        // application scope에 저장
        application.setAttribute("ddd", "홍길동4");

        return "target"; //target.html
    }

    @GetMapping("/session2")
    public String main2() {

        return "target"; //target.html
    }





}
