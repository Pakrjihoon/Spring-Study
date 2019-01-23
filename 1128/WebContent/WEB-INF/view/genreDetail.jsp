<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장르 상세</title>
</head>
<body>
<h1>${genre.name }</h1>
<dl>
	<dt>번호</dt>
	<dd>${genre.no }</dd>
	
	<dt>영화 갯수</dt>
	<dd>${genre.movieNum }</dd>
	
</dl>
	<h2>영화목록</h2>
	<ul>
	<c:forEach items="${genre.movies}" var="movie">
		<li>${movie.no}번 ${movie.name }</li>
	</c:forEach>
	</ul>
	<a href="${header.referer}">이전 페이지로</a>
</body>
</html>