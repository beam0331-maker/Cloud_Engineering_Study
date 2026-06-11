package com.exam.service;

import com.exam.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    List<TodoDTO> findAll(String userid);
    TodoDTO findById(int id);
    int save(TodoDTO todoDTO);
    int updateById(TodoDTO todoDTO);
    int deleteById(int id);

}
