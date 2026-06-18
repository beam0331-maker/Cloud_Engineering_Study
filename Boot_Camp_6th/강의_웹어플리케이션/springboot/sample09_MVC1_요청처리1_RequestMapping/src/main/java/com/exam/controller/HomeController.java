package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // http://localhost:8080/hello
    // @RequestMapping(value = "/hello")
    @RequestMapping("/hello")
    public String hello(){
        // model과 view 처리
        System.out.println("hello");
        return "main";
    }
    @RequestMapping(value = {"/hello2", "/hello3"})
    public String hello2(){
        // model과 view 처리
        System.out.println("hello2 및 hello3 요청");
        return "main";
    }
    // http://localhost:8080/yyy아무거나
    @RequestMapping(value ="/yyy*")
    public String yyy(){
        // model과 view 처리
        System.out.println("yyy");
        return "main";
    }
    // http://localhost:8080/zzz/아무거나
    @RequestMapping(value ="/zzz/*")
    public String zzz(){
        // model과 view 처리
        System.out.println("zzz");
        return "main";
    }

    // http://localhost:8080/xyz/아무거나/아무거나
    @RequestMapping(value ="/xyz/**")
    public String xyz(){
        // model과 view 처리
        System.out.println("xyz");
        return "main";
    }

    // http://localhost:8080/aaa/아무거나/bbb
    @RequestMapping(value ="/aaa/*/bbb")
    public String aaa_bbb(){
        // model과 view 처리
        System.out.println("aaa_bbb");
        return "main";
    }

    // http://localhost:8080/ccc/아무거나/아무거나/ddd
    /*
    다음과 같이 설정해야 가능
    applicaiotn.yml 에서 'spring.mvc.pathmatch.matching-strategy=ant_path_matcher'
     */
    @RequestMapping(value ="/ccc/**/ddd")
    public String ccc_ddd(){
        // model과 view 처리
        System.out.println("ccc_ddd");
        return "main";
    }

}
