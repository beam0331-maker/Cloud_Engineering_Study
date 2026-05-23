package com.exam.controller;

import com.exam.dto.MemberDTO;
import com.exam.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class MemberController {

    MemberService memberService;
    PasswordEncoder passwordEncoder;
    public MemberController(MemberService memberService,  PasswordEncoder passwordEncoder) {
        this.memberService = memberService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("dto", new MemberDTO());
        return "memberForm";
    }

    @PostMapping("/signup")
    public String signupForm(@Valid @ModelAttribute("dto") MemberDTO memberDTO,
                             BindingResult bindingResult, Model model) {

        // 검증실패
        if (bindingResult.hasErrors()) {
            return "memberForm";
        }

        String originalPassword = memberDTO.getPassword();
        String password = passwordEncoder.encode(originalPassword);
        memberDTO.setPassword(password);


        // 서비스연동
        // 추가로  예외처리 하기 ( 로컬 또는 전역)
        int n = memberService.signup(memberDTO);

        // 검증성공
        return "redirect:home";
    }
}
