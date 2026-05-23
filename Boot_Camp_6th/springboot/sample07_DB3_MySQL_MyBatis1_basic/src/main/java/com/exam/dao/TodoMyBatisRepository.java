package com.exam.dao;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoMybatisService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TodoMyBatisRepository {

    SqlSessionTemplate sqlSessionTemplate;
    public TodoMyBatisRepository(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate=sqlSessionTemplate;
    };

    // 목롭보기
    public List<TodoDTO> findAll(){
        List<TodoDTO> list = sqlSessionTemplate.selectList("com.exam.config.TodoMapper.findAll");
        return list;
    }// end findAll

    public TodoDTO findById(int id){
        TodoDTO dto = sqlSessionTemplate.selectOne("com.exam.config.TodoMapper.findById",id);
        return dto;
    }//end findById


    public int save(TodoDTO dto){
        return sqlSessionTemplate.insert("com.exam.config.TodoMapper.save",dto);
    }// end save


    public int updateById(TodoDTO dto){
        return sqlSessionTemplate.update("com.exam.config.TodoMapper.updateById",dto);
    }


    public int deleteById(int id){
        return sqlSessionTemplate.delete("com.exam.config.TodoMapper.deleteById",id);
    }
}
