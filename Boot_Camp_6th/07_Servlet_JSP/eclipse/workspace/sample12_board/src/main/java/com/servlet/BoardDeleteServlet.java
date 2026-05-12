package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.BoardDAO;
import com.dto.BoardDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;

@WebServlet("/BoardDeleteServlet")
public class BoardDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BoardService service = new BoardServiceImpl();
		service.setDao(new BoardDAO());
		
		
		String num =request.getParameter("num");
		int n = service.delete(Integer.parseInt(num));
		
		// 요청위임
		response.sendRedirect("BoardListServlet");
		
		
				
	}
}
