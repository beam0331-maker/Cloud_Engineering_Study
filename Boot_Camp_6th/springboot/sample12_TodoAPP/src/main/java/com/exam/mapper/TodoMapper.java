package com.exam.config;

import com.exam.dto.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TodoMapper {

    List<TodoDTO> findAll(String userid);
    TodoDTO findById(int id);
    int save(TodoDTO todoDTO);
    int updateById(TodoDTO todoDTO);
    int deleteById(int id);
}
