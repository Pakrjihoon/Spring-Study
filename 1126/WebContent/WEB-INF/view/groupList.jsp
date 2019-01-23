<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그룹 리스트</title>
</head>
<body>
	<h1>그룹 목록</h1>
	<ul>
		<c:forEach items="${groups}" var="group">
			<li><a href="/groupDetail.bjd?no=${group.groupId }">${group.name }</a></li>
		</c:forEach>
	</ul>
</body>
</html>