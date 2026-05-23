package com.exam.service;

import com.exam.mapper.TodoMapper;

import com.exam.dto.TodoDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("todoMyBatisService") // todoMyBatisService 필요없음
public class TodoMyBatisServiceImpl implements TodoMybatisService {

    TodoMapper todoMapper;
    public TodoMyBatisServiceImpl(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    @Override
    public List<TodoDTO> findAll() {
        return todoMapper.findAll();
    }// end findAll

    @Override
    public TodoDTO findById(int id) {
        return todoMapper.findById(id);
    }// findById

    @Override
    @Transactional
    public int save(TodoDTO dto) {
        return todoMapper.save(dto);
    }// end save

    @Override
    @Transactional
    public int updateById(TodoDTO dto) {
        return todoMapper.updateById(dto);
    }// end update

    @Override
    @Transactional
    public int deleteById(int id) {
        return todoMapper.deleteById(id);
    }
}
