package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;


@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// DeptService 연동
		DeptService service = new DeptServiceImpl();
		service.setDao(new DeptDAO());
		List<DeptDTO> list = service.findAll();
		
		response.setContentType("text/html");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.print("<html>");
		 out.print("<body>");		 
		 out.print("<table border='1'>");
		 out.print("<tr>");
		 out.print("<th>부서번호</th>");
		 out.print("<th>부서명</th>");
		 out.print("<th>부서위치</th>");
		 out.print("</tr>");
		 
		 for(DeptDTO dto : list) {
			 out.print("<tr>");
			 out.print("<th>" + dto.getDeptno() +"</th>");
			 out.print("<th>" + dto.getDname() +"</th>");
			 out.print("<th>" + dto.getLoc() +"</th>");			 
			 out.print("</tr>");
		 }
		 
		 out.print("</body>");
		 out.print("</html>"); 
	}

}
