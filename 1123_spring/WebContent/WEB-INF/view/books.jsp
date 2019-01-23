<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 목록 페이지</title>
</head>
<body>
<h1>책 목록</h1>
<div>${msg }</div>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>출판일</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${books}" var="book">
		<tr>
			<td>${book.no }</td>
			<th>${book.title }</th>
			<td>${book.author }</td>
			<td>${book.publicationDate }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>