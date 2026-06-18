package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// 세션에 저장된 데이터 얻기.
		
	// 1. 세션 얻기
	HttpSession session = request.getSession();

	// 2. 데이터 참조
	String userid = (String)session.getAttribute("userid");
	
	// 3. 로그인 여부 체크
	if( userid != null) {
		
		// 로그아웃 , 세션삭제
		session.invalidate();
		
		// 특정화면으로 요청위임
		response.sendRedirect("loginForm.jsp");
		
	}else {
		// 로그인 안했거나, time-out
		response.sendRedirect("loginForm.jsp");
	}
	
		
	}// end doGet

}// end class
