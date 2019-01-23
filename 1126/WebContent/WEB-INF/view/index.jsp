<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스 페이지</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="/join.bjd" method="post">
		<fieldset>
			<div>
				<input name="id" placeholder="아이디">
			</div>
			<div>
				<input name="password" type="password" placeholder="비밀번호">
			</div>
			<div>
				<input name="nickname" placeholder="닉네임">
			</div>
			<div>
				<input name="birthDate" placeholder="생년월일 ex)2012-12-12">
			</div>
			<button>회원가입</button>
		</fieldset>
	</form>
</body>
</html>