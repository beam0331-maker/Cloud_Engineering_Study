package com.exam.service;

import com.exam.dto.TodoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoMybatisService {
    List<TodoDTO> findAll();
    TodoDTO findById(int id);
    int save(TodoDTO dto);
    int updateById(TodoDTO dto);
    int deleteById(int id);
}
