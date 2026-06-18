package com.exam.service;

import com.exam.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    List<TodoDTO> findAll();    // public abstract 자동설정
    TodoDTO findByid(int id);
    int save(TodoDTO todoDTO);
    int update(TodoDTO todoDTO);
    int delete(int id);

}
