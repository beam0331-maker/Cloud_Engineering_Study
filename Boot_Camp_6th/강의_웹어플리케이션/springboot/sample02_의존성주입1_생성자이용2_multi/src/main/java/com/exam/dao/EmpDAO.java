package com.exam.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("EmpRepository")
public class EmpDAO {
    public EmpDAO() {
        System.out.println("EmpDAO");
    }

    // DB 연동 가정
    public List<String> findAll(){
        return Arrays.asList("Hong","Lee");
    }
}
