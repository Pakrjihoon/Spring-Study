<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 목록</title>
<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/paginate.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<style type="text/css">
	body {
	text-align: center;
	}
	h1 {
		font-size:40px;
		font-weight: bold;
		margin: 20px;
	}
	ul {
	text-align: center;
	}
	li {
	display:inline-block; 
	widht:200px;
	height:80px;
	border: 1px solid #ddd;
	line-height: 80px;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
			
	}
</style>
</head>
<body>
	<h1>영화 목록</h1>
	<ul>
	<c:forEach items="${movies }" var="movie">
		<li><a href="/movie/${movie.no }">${movie.no }번 ${movie.name }</a></li>
		</c:forEach>
	</ul>
	${paginate }
	<a href="/index">인덱스로</a>
</body>
</html>