<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멋진 웹서비스</title>
</head>
<body>
	<h1>멋진 웹 서비스</h1>
	<c:choose>
	<c:when test="${loginUser==null}">
		<h2>로그인</h2>
		<form action="login.html" method="POST">
			<fieldset>
				<legend>로그인폼</legend>
				<div>
				<input name="id" placeholder="아이디"/>
				</div>
				<div>
				<input name="password"
				 type="password"
				 placeholder="비밀번호"/>
				</div>
				<button>로그인</button>
			</fieldset>
		</form>
	</c:when>
	<c:otherwise>
		<h2>${loginUser.nickname }님 환영합니다.</h2>
		<a href="/logout.html">로그아웃</a>
	</c:otherwise>
	</c:choose>
</body>
</html>








