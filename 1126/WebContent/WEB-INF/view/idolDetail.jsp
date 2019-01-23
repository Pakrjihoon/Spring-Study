<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<h1>${idol.name }의 상세정보</h1>
	<dl>
		<dt>번호</dt>
		<dd>${idol.idolId }</dd>
		<dt>이름</dt>
		<dd>${idol.name }</dd>
		<dt>키</dt>
		<dd>${idol.height }</dd>
		<dt>몸무게</dt>
		<dd>${idol.weight }</dd>
	</dl>
	<a href="/idolList.bjd">아이돌 목록으로 돌아가기</a>
</body>
</html>