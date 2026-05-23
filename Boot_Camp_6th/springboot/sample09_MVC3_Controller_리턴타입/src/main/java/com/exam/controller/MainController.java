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

    // 1. String 타입
    // 뷰정보만 있고 모델 정보는 없다.
    // 화면만 보여주는 경우
    @GetMapping("/m")
    public String main() {

        return "main";
    }

    // 2. ModelAndView 타입
    // 뷰정보, 모델 정보 다 있음.
    @GetMapping("/m2")
    public ModelAndView main2() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main"); // view 설정
        mv.addObject("userid","정범석");
        return mv;
    }

    // 3. DTO 타입
    // 뷰 정보 없고, 모델 정보있음
    // 뷰정보는 요청매핑값으로 유추된다
    // ==> 요청매핑값을 html의 이름과 맞춰야 한다.
    // model의 키값을 변경 가능하다.
    @GetMapping("/m3")
    public @ModelAttribute("dto") LoginDTO main3() {
        LoginDTO dto = new LoginDTO("정범석","1234");
        return dto;
    }


    // 4. ArrayList 타입
    // 뷰 정보 없고, 모델 정보있음
    // 뷰정보는 요청매핑값으로 유추된다
    // ==> 요청매핑값을 html의 이름과 맞춰야 한다.
    // model의 키값을 변경 가능하다.
    @GetMapping("/m4")
    public @ModelAttribute("nameList") ArrayList<String> main4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("123");
        return list;
    }

    // 5. void 타입
    // 뷰정보 없고, 모델 정보 없다.
    // 뷰정보는 요청매핑값으로 유추된다
    // ==> 요청매핑값을 html의 이름과 맞춰야 한다.
    @GetMapping("/m5")
    public void main5() {

    }

}
