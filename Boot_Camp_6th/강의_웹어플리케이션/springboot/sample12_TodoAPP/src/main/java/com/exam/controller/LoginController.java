package com.exam.controller;

import com.exam.dto.MemberDTO;
import com.exam.service.AuthenticationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@SessionAttributes(value = "user_info")
public class LoginController {

    AuthenticationServiceImpl authenticationService;
    public LoginController(AuthenticationServiceImpl authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/login")
    public String login(Model model) {

        return "loginForm";
    }

    @PostMapping("/login")
    public String loginForm(@RequestParam Map<String, String> map, Model model,
                            RedirectAttributes redirectAttributes) {

        if(authenticationService.authenticate(map) != null){
            // 인증완료( userid와 password가 일치된 경우 )
            // 세션에 임의의 데이터 저장. ex. MemberDTO, userid...
            // 저장된 세션을 이용해서 로그인여부 확인(*********)

            MemberDTO memberDTO = authenticationService.authenticate(map);
            model.addAttribute("user_info", map.get("userid"));
            return "redirect:home";
        }

        // 인증실패 ( userid또는 password가 일치되지 않은 경우 )
        redirectAttributes.addFlashAttribute("errorMsg","userid와 password를 다시 입력해주세요" );
        return "redirect:login";
    }


    // 세션에 저장된 데이터 삭제
    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus) {

        // 세션 삭제하는 메소드
        sessionStatus.setComplete();
        return "redirect:/home";
    }

}
