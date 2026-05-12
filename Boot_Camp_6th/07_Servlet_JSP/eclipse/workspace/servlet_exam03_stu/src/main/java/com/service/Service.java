package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.ProductDAO;
import com.dto.Product;

public interface Service {
	void setDAO(ProductDAO dao);	
	List<Product> list();
	int insert(Product dto);
	int update(Product dto);
	List<String> idlist ();
	int delete(String id);
	int allDelete();

}
