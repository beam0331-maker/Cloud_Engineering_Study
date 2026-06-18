package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/loginForm")
    public String loginForm(){
        System.out.println("loginForm");
        return "loginForm";
    }

    @GetMapping("/login2")
    public  String hello2(HttpServletRequest request, HttpServletResponse response){
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        System.out.println(userid + " " +  password);
        return "main";
    }

    @GetMapping("/login3")
    public  String hello3(@RequestParam(name = "userid") String userid,
                         @RequestParam(value = "password") String password)// value는 name의 별칭
    {
        System.out.println(userid + ":" +  password);
        return "main";
    }

    // 파라미터 name 태그와 변수명이이 같다면 파라미터 name 태그 생략가능
    @GetMapping("/login4")
    public  String hello4(@RequestParam String userid,
                         @RequestParam String password)// value는 name의 별칭
    {
        System.out.println(userid + ":" +  password);
        return "main";
    }

    // @RequestParam은 필수, 반드시 동일한 name 태그로 넘겨줘야 한다. ( 필수 속성 )
    // 해당 name으로 전달하지 않으면 400 에러 발생
    // 필수 속성을 비활성화 시킬 수 있다. (required = false)
    // 비활성화하면 null값으로 설정됨
    // 기본값 설정이 가능하다 (defaultValue = "초기값")
    @GetMapping("/login5")
    public  String hello5(@RequestParam(name = "userid") String userid,
                          @RequestParam(value = "password", required = false, defaultValue = "9999") String password)// value는 name의 별칭
    {
        System.out.println(userid + ":" +  password);
        return "main";
    }

    // 사용자 입력 파라미터값이 자동으로 DTO에 저장가능.
    @GetMapping("/login6")
    public  String hello6(LoginDTO loginDTO) {
        System.out.println(loginDTO);
        return "main";
    }

    // 사용자 입력 파라미터값을 @RequestParam Map<String,Stirng>형태로 저장가능.
    @GetMapping("/login7")
    public  String hello(@RequestParam Map<String, String> map) {
        System.out.println(map);
        return "main";
    }

    @PostMapping("/login")
    public  String login(@RequestParam(name = "userid") String userid,
                         @RequestParam(value = "password") String password) {
        System.out.println(userid +":" +  password);
        return "main";
    }

}
