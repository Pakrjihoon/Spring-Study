<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<h1>${group.name }의 상세정보</h1>
	<dl>
		<dt>번호</dt>
		<dd>${group.groupId }</dd>
		<dt>그룹명</dt>
		<dd>${group.name }</dd>
		<dt>데뷔일</dt>
		<dd>${group.debutDate }</dd>
	</dl>
	<a href="/groupList.bjd">그룹 목록으로 돌아가기</a>
</body>
</html>