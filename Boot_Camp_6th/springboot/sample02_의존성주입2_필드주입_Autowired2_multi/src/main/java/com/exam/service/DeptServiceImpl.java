package com.exam.service;

import com.exam.dao.DeptDAO;
import com.exam.dao.EmpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

@Service("service")

public class DeptServiceImpl {

    @Autowired
    DeptDAO deptDao ;

    @Autowired
    EmpDAO empDao ;


    public List<String> findAll(){
        List<String> daoList = deptDao.findAll();
        List<String> empList = empDao.findAll();
        List<String> result = new ArrayList<>();
        result.addAll(daoList);
        result.addAll(empList);
        return result;
    }

}
