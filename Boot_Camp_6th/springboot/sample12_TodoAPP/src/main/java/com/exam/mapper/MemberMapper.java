package com.exam.config;

import com.exam.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberMapper {

    int signup(MemberDTO memberDTO);
    MemberDTO authenticate(Map<String,String> map);
}
