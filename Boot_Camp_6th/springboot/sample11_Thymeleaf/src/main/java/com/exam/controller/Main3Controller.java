package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes(value = {"session2", "xxx"})
public class Main3Controller {

    // 3. scpoe에 개체 저장하고 html에서 보여주기
    // ( 제어문 처리: if, switch, 3항 연산자, 반복문)
    @Autowired
    ServletContext servletContext;

    @GetMapping("/m3")
    public String m(Model model) {

        model.addAttribute("login",new LoginDTO("testID1", "testPassword1"));
        model.addAttribute("login2",new LoginDTO(null, "testPassword1") );

        List<LoginDTO> list = Arrays.asList(new LoginDTO("testID1", "testPassword1"),
                                            new LoginDTO("testID2", "testPassword1"),
                                            new LoginDTO("testID3", "testPassword1"));
        model.addAttribute("mylist",list);
        return "main3";
    }

}
