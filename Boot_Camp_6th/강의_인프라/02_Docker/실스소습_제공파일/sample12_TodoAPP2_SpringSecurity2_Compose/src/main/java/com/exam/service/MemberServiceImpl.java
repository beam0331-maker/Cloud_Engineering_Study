package com.exam.service;

import com.exam.dto.MemberDTO;
import com.exam.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {

    MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper  memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    @Transactional
    public int signup(MemberDTO memberDTO) {
        return memberMapper.signup(memberDTO);
    }

    @Override
    public MemberDTO findById(String userid) {
        return memberMapper.findById(userid);
    }
}
