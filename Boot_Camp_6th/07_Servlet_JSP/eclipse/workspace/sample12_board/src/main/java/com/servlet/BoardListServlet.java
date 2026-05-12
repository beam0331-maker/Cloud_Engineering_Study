package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.net.ServletConnectionImpl;

import com.dao.BoardDAO;
import com.dto.BoardDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;

@WebServlet("/BoardListServlet")
public class BoardListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardService service = new BoardServiceImpl();
		service.setDao(new BoardDAO());
		List<BoardDTO> list = service.list();
		
		// scope에 저장
		request.setAttribute("list", list);
		
		// 요청위임 -> request scope 의 데이터를 가져와야 하기 때문
		request.getRequestDispatcher("list.jsp").forward(request, response);	
	}

}
