package com.sevlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/MemberServlet3")
public class MemberServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("MemberServlet3.doGet");
		
		// 파라미터 얻기
		String[] hobbies = request.getParameterValues("hobby");	
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		System.out.println(username + " " + age + Arrays.toString(hobbies));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World</h1>");
		out.print("<h1>"+ username +"</h1>");
		out.print("<h1>"+ age +"</h1>");
		out.print("<h1>"+ Arrays.toString(hobbies) +"</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
