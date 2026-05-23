package com.exam.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Map;

@Controller
public class MainController {

    // 쿠키 생성
    @GetMapping("/set")
    public String main(HttpServletRequest request, HttpServletResponse response) {
        Cookie c = new Cookie("userid", "홍길동");
//        c.setMaxAge(3600);
        response.addCookie(c);

        return "main";
    }

    // 쿠키 참조
    @GetMapping("/get")
    public String main2(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userid")) {
                System.out.println(cookie.getValue());
            }
        }
        return "main";
    }

    // Spring 쿠키 참조
    @GetMapping("/get2")
    public String main3(@CookieValue("userid") String userid) {
       System.out.println(userid);
        return "main";
    }


}
