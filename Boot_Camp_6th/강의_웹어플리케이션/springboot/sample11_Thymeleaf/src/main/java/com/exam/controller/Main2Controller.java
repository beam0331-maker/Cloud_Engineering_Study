package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class Main2Controller {

    // 2. scope에 객체 저장하고 html에서 보여주기
    @Autowired
    ServletContext servletContext;

    @GetMapping("/m2")
    public String m(Model model) {

        model.addAttribute("login", new LoginDTO("testID","testPW"));

        return "main2";
    }

}
