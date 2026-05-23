package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class Main5Controller {

    // 5. 유틸리티
    @GetMapping("/m5")
    public String m(Model model) {

        // 날짜 유틸리티
        model.addAttribute("today", LocalDate.now());
        System.out.println(LocalDate.now());

        // 문자열 유틸리티
        model.addAttribute("username", "HongKilDong");

        // 숫자 유틸리티
        model.addAttribute("num", 123456789);

        // 리스트 유틸리티

        model.addAttribute("mylist", Arrays.asList("A", "B", "C"));

        return "main5";
    }


}
