package com.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.dao.ProductDAO;
import com.service.Service;
import com.service.ServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ProductDeleteServlet")
public class ProductDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service service = new ServiceImpl();
		service.setDAO(new ProductDAO());
		
		Set<String> keySet = new HashSet<String>(service.idlist());
		String id = request.getParameter("id");
		
		if(keySet.contains(id)) {
			int n = service.delete(id); 
			response.sendRedirect("productMain.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
		
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
