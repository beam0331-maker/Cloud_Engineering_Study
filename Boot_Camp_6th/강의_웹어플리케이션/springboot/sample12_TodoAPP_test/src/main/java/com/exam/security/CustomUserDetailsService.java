package com.exam.security;

import com.exam.dto.MemberDTO;
import com.exam.service.MemberService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    MemberService memberService;
    public CustomUserDetailsService(MemberService memberService) {
        this.memberService = memberService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MemberDTO dto = memberService.findById(username);
        if (dto == null) {
            throw new UsernameNotFoundException(username + "not found");
        }

        return new CustomUserDetails(dto, List.of(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
