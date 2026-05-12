package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Product;

public class ProductDAO {
	public List<Product> list(SqlSession session){
		List<Product> list = session.selectList("com.config.productMapper.list");
		return list;
	}//end list
	public int insert(SqlSession session, Product dto) {
		int n =  session.insert("com.config.productMapper.insert",dto);
		return n;
	}// end insert
	public int update(SqlSession session, Product dto) {
		int n =  session.update("com.config.productMapper.update",dto);
		return n;
	}// end update
	public List<String> idlist (SqlSession session){
		List<String> list = session.selectList("com.config.productMapper.idlist");
		return list;
	}// end idlist
	public int delete(SqlSession session,String id){
		int n  = session.delete("com.config.productMapper.delete",id);
		return n;
	}// end delete
	public int allDelete(SqlSession session){
		int n  = session.delete("com.config.productMapper.alldelete");
		return n;
	}
}
