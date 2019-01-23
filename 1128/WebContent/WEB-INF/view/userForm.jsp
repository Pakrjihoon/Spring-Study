<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 <c:choose>
		<c:when test="${user==null }">가입</c:when>
		<c:otherwise>수정</c:otherwise>
	</c:choose>
</title>
</head>
<body>
	<h1>
		회원
		<c:choose>
			<c:when test="${user==null }">가입</c:when>
			<c:otherwise>수정</c:otherwise>
		</c:choose>
	</h1>
	<form action="/user" method="post">
	<c:if test="${user!=null }">
	<input type="hidden" name="_method" value="PUT"/>
	<input type="hidden" name="no" value="${user.no}">
	</c:if>
		<fieldset>
			<legend>
				회원
				<c:choose>
					<c:when test="${user==null }">가입</c:when>
					<c:otherwise>수정</c:otherwise>
				</c:choose>
				폼
			</legend>
			<%-- VO의 멤버필드와 동일하게 name을 작서해준다. --%>
			<div>
				<input placeholder="아이디" name="id" 
				<c:if test="${user!=null }">
				disabled
				</c:if> value="${user.id }"/>
			</div>
			<div>
				<input placeholder="비밀번호" type="password" name="password" />
			</div>
			<div>
				<input placeholder="닉네임" name="nickname" value="${user.nickname }"/>
			</div>
			<button>
				회원
				<c:choose>
					<c:when test="${user==null }">가입</c:when>
					<c:otherwise>수정</c:otherwise>
				</c:choose>
			</button>
		</fieldset>
	</form>
	<a href="/index">인덱스로</a>
</body>
</html>