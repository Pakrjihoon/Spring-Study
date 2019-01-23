<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장르 ${title}  페이지</title>
</head>
<body>
	<h1>장르 ${title }</h1>
	
	<form action="/genre" method="POST">
	<c:if test="${genre!=null }">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="hidden" name="no" value="${genre.no }"/>
	</c:if>
		<fieldset>
			<legend> 장르 ${title }폼</legend>
			<input name="name" placeholder="장르명" value="${genre.name }"/>
			<button>${title }</button>
		</fieldset>
	</form>
	<a href="/genre">목록으로</a>
</body>
</html>