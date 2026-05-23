package com.exam.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(HttpServletRequest request) {

        Enumeration<String> enu = request.getHeaderNames();
        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ":" + value);
        }

        String browser = request.getHeader("User-Agent");
        System.out.println(browser);
        return "main";
    }

    @GetMapping("/main2")
    public String getSingleHeader(@RequestHeader(name = "user-Agent") String userAgent,
                                  @RequestHeader(name = "connection")String connection ) {

       System.out.println("user-Agent: " + userAgent);
       System.out.println("connection: " + connection);
       return "main";
    }

}
