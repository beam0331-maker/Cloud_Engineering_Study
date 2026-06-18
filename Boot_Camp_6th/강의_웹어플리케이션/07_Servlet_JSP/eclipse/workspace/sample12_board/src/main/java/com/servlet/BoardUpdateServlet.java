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

@WebServlet("/BoardUpdateServlet")
public class BoardUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BoardService service = new BoardServiceImpl();
		service.setDao(new BoardDAO());
		
		// 사용자 입력데이터 얻기
		String num = request.getParameter("num");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setNum(Integer.parseInt(num));
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setContent(content);	
		
		int n = service.update(dto);
		
		// 요청위임
		response.sendRedirect("BoardListServlet");
		
	}
}
