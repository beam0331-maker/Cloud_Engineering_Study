package com.exam.service;

import com.exam.dao.DeptDAO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
// @Scope("prototype")
// @Scope("singleton")
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DeptServiceImpl {
    DeptDAO dao ;

    // 생성자주입
    public DeptServiceImpl(DeptDAO dao) {
        System.out.println("DeptServiceImpl");
        this.dao = dao;
    }

    public List<String> findAll(){
        return dao.findAll();
    }

}
