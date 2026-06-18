package com.exam.service;

import com.exam.dao.TodoMyBatisRepository;
import com.exam.dto.TodoDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("todoMyBatisService") // todoMyBatisService 필요없음
public class TodoMyBatisServiceImpl implements TodoMybatisService {

    TodoMyBatisRepository todoMyBatisRepository;
    public TodoMyBatisServiceImpl(TodoMyBatisRepository todoMyBatisRepository) {
        this.todoMyBatisRepository = todoMyBatisRepository;
    }

    @Override
    public List<TodoDTO> findAll() {
        return todoMyBatisRepository.findAll();
    }// end findAll

    @Override
    public TodoDTO findById(int id) {
        return todoMyBatisRepository.findById(id);
    }// findById

    @Override
    @Transactional
    public int save(TodoDTO dto) {
        return todoMyBatisRepository.save(dto);
    }// end save

    @Override
    @Transactional
    public int updateById(TodoDTO dto) {
        return todoMyBatisRepository.updateById(dto);
    }// end update

    @Override
    @Transactional
    public int deleteById(int id) {
        return todoMyBatisRepository.deleteById(id);
    }
}
