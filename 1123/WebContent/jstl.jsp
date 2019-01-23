<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<% 
	List<User> list = new ArrayList();	
	list.add(new User("test1","1111","html"));	
	list.add(new User("test2","1111","css"));	
	list.add(new User("test3","1111","javascript"));	
	list.add(new User("test4","1111","java"));	

	/*
		JSTL이란 ?
		- Java Standard Tag Library의 줄임말
		- if~else / for문(분기문, 반복문) 등을 태그로
		- lib폴더에 라이브러리(jar) 추가
		- taglib 지시어 설정
		- <c:if> : if문
		- <c:choose><c:when><c:otherwise> : if~else 문
		- <c:forEach> : for문
	*/
	//session.setAttribute("loginUser",new User("test","1111","골든벨"));
		
	request.setAttribute("users", list);	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제</title>
</head>
<body>
<c:choose>
<c:when test="${loginUser==null }">
	<h2>로그인폼</h2>
	<form method="post" action="login.jsp">
		<fieldset>
			<legend>로그인 폼</legend>
			<input placeholder = "아이디"/>
			<input placeholder = "비밀번호"/>
			<button>로그인</button>
		</fieldset>
	</form>
	</c:when>
	<c:otherwise>
	<h2>${loginUser.nickname } 님 환영합니다.</h2>
	<a href="logout.jsp">로그아웃</a>
	</c:otherwise>
	</c:choose>
	<!-- 기존에 쓰던 방식 -->
	<h2>유저 목록</h2>
	<ul>
	<% for(User user : list) { %>
		<li>아이디 : <%=user.getId() %>/
		 비번 : <%=user.getPassword() %> /
		 닉네임 : <%=user.getNickname() %></li>
		 <% } %>
	</ul>
	
	<!-- 새로운 방식 -->
	<h2>유저 목록2</h2>
	<ul>
		<c:forEach items="${users }" var="user">
		<li>아이디 : ${user.id }/ 비번 : ${user.password } / 닉네임 : ${user.nickname } </li>
		</c:forEach>
	</ul>
</body>
</html>