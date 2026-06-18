package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class MainController {

    // 1. scope에 저장하고 html에서 보여주기
    @Autowired
    ServletContext servletContext;

    @GetMapping("/m")
    public String m(Model model) {

        model.addAttribute("request","홍길동");
        model.addAttribute("request2","<h1>홍길동</h1>");

        model.addAttribute("session2","홍길동2");
        model.addAttribute("xxx","홍길동3");

        servletContext.setAttribute("application2","홍길동4");
        return "main";
    }

}
