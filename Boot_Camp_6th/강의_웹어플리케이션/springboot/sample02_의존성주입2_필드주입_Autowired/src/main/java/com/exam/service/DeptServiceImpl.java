package com.exam.service;

import com.exam.dao.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")

public class DeptServiceImpl {

    @Autowired
    DeptDAO deptDAO;

    public List<String> findAll(){
        return deptDAO.findAll();
    }

}
