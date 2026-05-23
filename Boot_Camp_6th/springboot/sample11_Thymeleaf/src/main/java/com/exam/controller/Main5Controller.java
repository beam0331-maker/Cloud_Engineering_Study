package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class Main4Controller {

    // 4. 경로(링크 @)
    @GetMapping("/m4")
    public String m(Model model) {
        model.addAttribute("userid", "test_ID");
        return "main4";
    }

    @GetMapping("/m4-1")
    public String m1(@RequestParam(required = false) String id,
                     @RequestParam(required = false) String pw) {

        System.out.println("ID: " + id + " PW: " + pw);
        return "loginForm";
    }

    @GetMapping("/m4-2")
    public String m2(@RequestParam(required = false) String userid,
                     @RequestParam(required = false) String password) {

        System.out.println("ID: " + userid + " PW: " + password);
        return "loginForm";
    }

}
