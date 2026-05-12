package com.exam.service;

import org.springframework.stereotype.Service;

@Service("service")

public class ServiceImpl {

    public ServiceImpl() {
        System.out.println("ServiceImpl");
    }
}
