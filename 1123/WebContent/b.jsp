<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 

	String no = request.getParameter("no");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b.jsp 페이지</title>
</head>
<body>
<h1>여기는 b.jsp입니다.</h1>
<h2>넘어온 파라미터 : <%=no %></h2>
</body>
</html>