package com.exam.service;

import com.exam.dto.MemberDTO;
import org.springframework.stereotype.Service;


public interface MemberService {
    int signup(MemberDTO memberDTO);
}
