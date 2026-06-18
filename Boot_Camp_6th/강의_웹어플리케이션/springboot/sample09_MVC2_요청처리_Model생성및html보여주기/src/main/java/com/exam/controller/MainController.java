package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/m")
    public String main(HttpServletRequest request) {
        request.setAttribute("userid","test01");
        request.setAttribute("email","test01@exam.com");
        return "main";
    }

    @GetMapping("/m2")
    public String main2(Model model) {
        model.addAttribute("userid","test02");
        model.addAttribute("email","test02@exam.com");
        return "main2";
    }

    @GetMapping("/m3")
    public String main2(Map<String, String> map) {
        map.put("userid","test03");
        map.put("email","test03@exam.com");
        return "main3";
    }

    @GetMapping("/m4")
    public String main4(@ModelAttribute("dto") LoginDTO dto) {
        // 모델이 된다 --> html에서 보여줄 수 있음.
        // 자동으로 ("loginDTO",loginDTO)
        // 명시적으로 key 지정 가능. @ModelAttribute("key")
        // 이제는 ("key",loginDTO)

        // DB연동해서 가져온 LoginDTO 데이터(모델)
        // request.setAttribute("dto",loginDTO);
        // model.addAttribute("dto",loginDTO);
        // map.put("dto",loginDTO);

        dto.setUserid("test04");
        dto.setPassword("q1w2e3r4");

        return "main4";
    }

    @GetMapping("/m5")
    public String main5(@ModelAttribute("yyy") ArrayList<String> nameList) {
        // 자동으로 모델로 저장됨.
        // @ModelAttribute("yyy") 지정 --> 모델 저장할때 ("key", nameList) 저장됨

        nameList.add("hello");
        nameList.add("world");
        nameList.add("test");
        return "main5";
    }

    @GetMapping("/m6")
    public ModelAndView main6() {

        // ModelAndView
        ModelAndView mv = new ModelAndView();
        // view 지정
        mv.setViewName("main6");

        // 모델 지정
        mv.addObject("userid","test06");
        mv.addObject("dto", new LoginDTO("test06", "123456"));
        mv.addObject("list", Arrays.asList("hello", "world", "test06"));
        mv.addObject("dtolist", Arrays.asList(new LoginDTO("testId01", "testPw01"),
                new LoginDTO("testId02","testPw02"),
                new LoginDTO("testId03","testPw03")));

        return mv;
    }
}
