package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.juli.logging.Log;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
public class MainController {

    // ResponseBody
    // 자바코드를 JSON 형태로 응답보내는 경우 사용된다.

    // 1. 리턴이 String
    @GetMapping("/aaa")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String aaa() {
        return "Hello World";
    }

    // 2. 리턴 LoginDTO
    @GetMapping("/bbb")
    @ResponseBody // LoginDTO를 JSON 포맷으로 바꿔줌
    public LoginDTO bbb() {
        LoginDTO dto = new LoginDTO("홍길동", "1234");
        return dto;
    }

    // 3. 리턴 ArrayList
    @GetMapping("/ccc")
    @ResponseBody
    public ArrayList<LoginDTO> ccc() {
        ArrayList<LoginDTO> list = new ArrayList<>();
        list.add(new LoginDTO("홍길동","1234"));
        list.add(new LoginDTO("홍길동2","1234"));
        return list;
    }

    // 4. 리턴 HashMap
    @GetMapping("/ddd")
    @ResponseBody
    public HashMap<String,ArrayList<LoginDTO>> ddd() {
        HashMap<String,ArrayList<LoginDTO>> map = new HashMap<>();
        ArrayList<LoginDTO> list1 = new ArrayList<>();
        list1.add(new LoginDTO("홍길동","1234"));
        list1.add(new LoginDTO("홍길동2","1234"));

        ArrayList<LoginDTO> list2 = new ArrayList<>();
        list2.add(new LoginDTO("홍길동3","1234"));
        list2.add(new LoginDTO("홍길동4","1234"));
        map.put("one", list1);
        map.put("two", list2);

        return map;
    }

    // 5.
    // produces: 응답타입을 요청한다 (ex. text/xml ==> xml 형태로 요청)
    @GetMapping(value = "/eee", produces = "text/xml")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String eee() {
        return "<Person><name>hong</name><age>20</age></Person>";
    }

    // 6.
    @GetMapping(value = "/fff" , produces = "text/html")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String  fff(){
        return "<html><body><h1>Hello</h1></body></html>";
    }

    ////////////////////////////////////////////////////////

    /*
        POST http://localhost:80080/ggg

        {
          "userid":"홍길동",
          "password":"1234"
        }
     */

    // 1.
    @PostMapping("/ggg")    // 반드시 POST
    @ResponseBody   // 실습편의성을 위해 뷰를 생성하지 않기위함
    // @RequestBody: JOSN Request를 받을 수 있따
    public String ggg(@RequestBody LoginDTO dto) {
        System.out.println(dto);
        return "Hello World";
    }


    /*
        POST http://localhost:80080/ggg

        [
            {
          "userid":"홍길동",
          "password":"1234"
            },
            {
          "userid":"홍길동2",
          "password":"1234"
            }
        ]

     */

    // 2.
    @PostMapping("/hhh")    // 반드시 POST
    @ResponseBody
    public String hhh(@RequestBody ArrayList<LoginDTO> dto) {
        System.out.println(dto);
        return "Hello World";
    }
}
