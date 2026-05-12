package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ProductDAO;
import com.dto.Product;

public class ServiceImpl implements Service{
	ProductDAO dao;

	@Override
	public void setDAO(ProductDAO dao) {
		this.dao = dao;
	}// end setDAO

	@Override
	public List<Product> list() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Product> list = null;
		try {
			list = dao.list(session);
		} finally {
			session.close();
		}
		return list;
	}// end list

	@Override
	public int insert(Product dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.insert(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}// end insert
	
	@Override
	public int update(Product dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.update(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}// end update
	
	@Override
	public List<String> idlist() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<String> list = null;
		try {
			list = dao.idlist(session);
		} finally {
			session.close();
		}
		return list;
	}// end idlist
	
	@Override
	public int delete(String id) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.delete(session, id);
			if(n == 1) session.commit();
		} finally {
			session.close();
		}
		return n;
	}// end delete
	@Override
	public int allDelete() {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.allDelete(session);
			if(n >= 1) session.commit();
		} finally {
			session.close();
		}
		return n;
	}
}
