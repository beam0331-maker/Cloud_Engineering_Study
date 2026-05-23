package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class Main6Controller {

    // 6. 화면재사용
    @GetMapping("/m6")
    public String m(Model model) {


        return "main6";
    }


}
