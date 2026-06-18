package com.exam.service;

import com.exam.dao.DeptDAO;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")

public class DeptServiceImpl {
    DeptDAO dao ;
    public DeptServiceImpl(DeptDAO dao) {
        System.out.println("ServiceImpl");
        this.dao = dao;
    }

    public List<String> findAll(){
        return dao.findAll();
    }

    //초기화
    @PostConstruct
    public void start(){
        System.out.println("start");
    }

    @PreDestroy
    public void shutdown(){
        System.out.println("shutdown");
    }
}
