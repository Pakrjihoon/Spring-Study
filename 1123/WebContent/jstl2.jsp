<%@page import="vo.Idol"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<% 
	List<Idol> list = new ArrayList();
	list.add(new Idol("솔라빔",162.2, 45));
	list.add(new Idol("달스타",163.4, 45));
	list.add(new Idol("휘파람",161.5, 44));
	list.add(new Idol("김건휘",162.7, 47));
	
	request.setAttribute("idols", list);
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제2</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>키</th>
				<th>몸무게</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${idols}" var="idolList">
			<tr>
				<td>${idolList.name }</td>
				<td>${idolList.height }cm</td>
				<td>${idolList.weight }kg</td>				
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>