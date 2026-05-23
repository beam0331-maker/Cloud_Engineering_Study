package com.exam.dao;

import com.exam.dto.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    @Autowired
    JdbcTemplate  template;

    public TodoRepository(JdbcTemplate  template) {
        this.template = template;
    }

    // 목록보기
    public List<TodoDTO> findAll3(){
        String sql = "select id, name, job from todo";

        //RowMapper 인터페이스 생성 - 익명클래스
        RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
            @Override
            public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            }
        };

        List<TodoDTO> list = template.query(sql,mapper);
        return list;
    }// end findAll


    // 목록보기2
    public List<TodoDTO> findAll2(){
        String sql = "select id, name, job from todo";


        List<TodoDTO> list = template.query(sql, new RowMapper<TodoDTO>() {
            @Override
            public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            }
        });
        return list;
    }// end findAll


    // 목록보기3
    public List<TodoDTO> findAll(){
        String sql = "select id, name, job from todo";

        //RowMapper 인터페이스 생성 - 익명클래스
        RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
            @Override
            public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            }
        };

        // 람다표현식
        RowMapper<TodoDTO> mapper2 = ( rs,  rowNum) -> {
            TodoDTO todoDTO = new TodoDTO();
            todoDTO.setId(rs.getInt("id"));
            todoDTO.setName(rs.getString("name"));
            todoDTO.setJob(rs.getString("job"));
            return todoDTO;
        };

        List<TodoDTO> list = template.query(sql,(rs,rowNum)-> {
            TodoDTO todoDTO = new TodoDTO();
            todoDTO.setId(rs.getInt("id"));
            todoDTO.setName(rs.getString("name"));
            todoDTO.setJob(rs.getString("job"));
            return todoDTO;
        });
        return list;
    }// end findAll

    // id로 찾기
    public TodoDTO findById(int id){

        String sql = "select id, name, job from todo where id = ?";
        RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
            @Override
            public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            }
        };

         TodoDTO dto = template.queryForObject(sql,(rs, rowNum) -> {
             TodoDTO todoDTO = new TodoDTO();
             todoDTO.setId(rs.getInt("id"));
             todoDTO.setName(rs.getString("name"));
             todoDTO.setJob(rs.getString("job"));
             return todoDTO;
         }, id);

        return dto;
    }//end findById

    // insert 작성
    public int save(TodoDTO todoDTO){

        String url = "insert into todo (id, name, job) values (?, ?, ?)";
        int n = template.update(url,todoDTO.getId(),todoDTO.getName(),todoDTO.getJob());
        return n;
    }// end save

    //update작성
    public int update(TodoDTO todoDTO){
        String url = "update todo  set name = ?, job = ? where id = ?";
        int n = template.update(url,todoDTO.getName(),todoDTO.getJob(),todoDTO.getId());
        return n;
    }//end update

    //delete
    public int delete(int id){
        String url = "delete from todo  where id = ?";
        int n = template.update(url,id);
        return n;
    }//end delete
}
