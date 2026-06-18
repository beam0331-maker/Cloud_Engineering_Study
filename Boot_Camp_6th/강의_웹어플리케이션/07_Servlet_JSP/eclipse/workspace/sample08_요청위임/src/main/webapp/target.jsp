<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String s = (String) request.getAttribute("key");
	String s2 = (String) session.getAttribute("key2");
	String s3 = (String) application.getAttribute("key3");
	%>
	<h1>
		request:
		<%=s%></h1>
	<br>
	<h1>
		session:
		<%=s2%></h1>
	<br>
	<h1>
		application:
		<%=s3%></h1>
	<br> target.jsp
</body>
</html>