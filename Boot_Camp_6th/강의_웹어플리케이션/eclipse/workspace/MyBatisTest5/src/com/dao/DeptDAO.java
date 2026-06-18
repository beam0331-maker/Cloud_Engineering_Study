package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.dto.DeptDTO;

public class DeptDAO {
	
	public List<DeptDTO> findALl(SqlSession session){
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.findAll");
		return list;
	}
	
	public int insert (SqlSession session, DeptDTO dto){
		int n = session.insert("com.config.DeptMapper.insert",dto);
		return n;
	}
	
	public int delete (SqlSession session, int deptno){
		int n = session.insert("com.config.DeptMapper.delete",deptno);
		return n;
	}
	public int update (SqlSession session, HashMap<String, Object> map){
		int n = session.insert("com.config.DeptMapper.update",map);
		return n;
	}
	public int update2 (SqlSession session, DeptDTO dto){
		int n = session.insert("com.config.DeptMapper.update",dto);
		return n;
	}
	
	
	
	
	
		
}
