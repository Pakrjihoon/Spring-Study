<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화관리 웹서비스</title>
<style type="text/css">
html {
	height: 100%;
}

body {
	height: 100%;
	background-image: url(img/back.jpg);
	background-position: center;
	background-size: cover;
	color: #eee;
}

a {
	color: #40beed;
}

#msgPopup {
	position: fixed;
	width: 100%;
	height: 100%;
	background-color: rgba(0, 0, 0, .8);
	font-size: 30px;
	text-align: center;
	left: 0;
	top: 0;
	line-height: 300px;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Awesome Movie Management Service</h1>
	<c:choose>
		<c:when test="${loginUser==null }">
			<h2>로그인</h2>
			<form action="/session" method="POST">
				<fieldset>
					<legend>로그인폼</legend>
					<div>
						<input name="id" placeholder="아이디" />
					</div>
					<div>
						<input name="password" type="password" placeholder="비밀번호" />
					</div>
					<button>로그인</button>
				</fieldset>
			</form>
			<a href="/user/join">회원가입</a>
		</c:when>
		<c:otherwise>
			<h2>${loginUser.nickname }님환영합니다.</h2>
			<a href="/user/${loginUser.no }/update">정보 수정</a>
			<form action="/session" method="POST">
				<input type="hidden" name="_method" value="DELETE" />
				<button>로그아웃</button>
				
				<h2>서비스 목록</h2>
				<ul>
					<li><a href="/genre/page/1">장르 목록</a></li>
					<li><a href="/movie/page/1">영화 목록</a></li>
				</ul>
		</c:otherwise>
	</c:choose>
	</form>
	<%--
			WWW의 스펙에는 GET,POST,PUT,DELETE가 있지만
			거의 모든 브라우저에서는 
			PUT,DELETE를 지원하지 않습니다.
			
			그래서 개발자들사이에서는 (거의)표준으로
			이런방식을 이용하죠.
			
			클라이언트에서 
			
			1) 폼의 메서드는 post로
			2) <input type="hidden" name="_method" value="DELETE"/>
			   <input type="hidden" name="_method" value="PUT"/>
   			
   			서버에서 설정(web.xml)
   			
		 --%>
	<c:if test="${msg!=null }">
		<div id="msgPopup">${msg }</div>
		<script src="/js/jquery.js"></script>
		<script>
			setTimeout(function() {
				$("#msgPopup").fadeOut();
			}, 2000);
		</script>
	</c:if>
</body>
</html>