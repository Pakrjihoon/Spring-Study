<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장르리스트</title>
<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/paginate.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<style>
h2 {
	font-size: 40px;
	font-weight: bold;
	text-align: center;
	margin: 20px;
}
ul::after {
	content: "";
	display: block;
	clear: both;
}

li {
	position: relative;
	list-style: none;
	width: 200px;
	height: 80px;
	border: 1px solid #ddd;
	float: left;
	margin: 10px 0 0 10px;
	line-height: 80px;
	text-indent: 20px;
}

li:hover {
	box-shadow: 0 12px 15px 0 rgba(0, 0, 0, 0.24);
}

li:hover .btn_delete {
	opacity: 1;
}

.btn_delete {
	position: absolute;
	bottom: 5px;
	right: 10px;
	opacity: .1;
	cursor: pointer;
}
.btn_update {
	position: absolute;;
	top : 5px;
	right : 5px;
	line-height : 1em;
	text-decoration: none;
}

</style>
</head>
<body>
	<h2>장르 목록</h2>
	<ul>
		<c:forEach items="${genreList }" var="genre">
		<a href="/genre/${genre.no }">
			<li>${genre.no }번${genre.name }
			</a>
			<c:if test="${genre.movieNum==0 }">
					<form action="/genre/${genre.no }" method="POST">
						<input type="hidden" name="_method" value="DELETE" />
						<%-- <input type="hidden" name="no" value="${genre.no }"/>--%>
						<button class="btn_delete">삭제</button>
					</form>
				</c:if>
				<a class="btn_update" href="/genre/${genre.no }/update">수정</a>
			</li>
		</c:forEach>
	</ul>
	${paginate }
	<a href="/genre/register">장르 입력</a>
	<a href="/index">인덱스로</a>
</body>
</html>