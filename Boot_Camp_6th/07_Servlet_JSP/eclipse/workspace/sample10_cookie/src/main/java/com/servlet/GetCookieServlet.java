package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠키 조회
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			String key =  c.getName();
			if("uesrname".equals(key)) {
				String value = c.getValue();
				System.out.println(key+ " "+ value);
			}
		}				
	}
}
