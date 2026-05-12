<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="BoardWriteServlet" method="get">
제목: <input type="text" name="title"><br>
작성자:<input type="text" name="author"><br>
내용:<br> 
<textarea rows="20" cols="50" name="content"></textarea><br>
<input type="submit" value="저장">
</form>
<a href="BoardListServlet">목록보기</a>
</body>
</html>