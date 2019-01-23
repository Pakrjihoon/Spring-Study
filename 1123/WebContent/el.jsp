<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	User loginUser = new User("test","1111","테스터");

	List<User> list = new ArrayList();
	list.add(new User("test2","1111","테스터2"));
	list.add(new User("test3","1111","테스터3"));
	list.add(new User("test4","1111","테스터4"));
	list.add(new User("test5","1111","테스터5"));
	list.add(new User("test6","1111","테스터6"));
	list.add(new User("test7","1111","테스터7"));
	
	session.setAttribute("list",list);
	request.setAttribute("msg","이제 점심시간 입니다.");
	request.setAttribute("loginUser", loginUser);
	
	// ServletContext 범위
	// application.setAttribute("loginUser", loginUser);

	// pageContext 범위
	// pageContext.setAttribute("loginUser", loginUser);
	// User loginUser2 = (User)pageContext.getAttribute("loginUser");
	
	/*
		웹에서 attribute는 4가지 scope(범위)를 가집니다.
		1) page : 그 페이지에서만 (거의 안씀)
		2) request : request 객체안에서
		3) session : 세션 (브라우저 기준)
		4) context : WAS가 켜져있는 동안
	*/

	/*
		el은 expression language의 줄임말
		표현식 대신 사용
		
		표현식은 프로그래밍 자바 문법
		el은 일반인도 이해하기 쉬운 문법
		(퍼블리셔나 디자이너도 쉽게 이해할 수 있음)
		
		el은 attribute만 출력할 수 있음
		el은 ${}
		
	*/
	// el을 쓰면 해당 코드가 필요가 없다.
	//User loginUser2 = (User)request.getAttribute("loginUser");
	request.setAttribute("gender","F");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User 예제</title>
</head>
<body>
<div>유저 이름 : ${loginUser.nickname } </div>
<div>아이디 : ${loginUser.id }</div>
<div>비밀번호 : ${loginUser.password } </div>
<div>메시지 : ${msg }</div>
<div>리스트 : ${list[0].nickname} </div>
<div>여자인가요 ? ${gender=="F" }</div>
</body>
</html>