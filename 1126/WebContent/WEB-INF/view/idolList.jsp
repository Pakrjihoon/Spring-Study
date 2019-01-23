<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이돌 리스트</title>
</head>
<body>
	<h1>아이돌 목록</h1>
	<ul>
		<c:forEach items="${idols }" var="idol">
			<a href="idolDetail.bjd?no=${idol.idolId }"><li>${idol.name }</li></a>
		</c:forEach>
	</ul>
</body>
</html>