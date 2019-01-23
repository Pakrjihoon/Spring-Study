<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>MODEL2 게시판</title>
<c:import url="/WEB-INF/template/link.jsp"></c:import>
</head>
<c:import url="/WEB-INF/template/header.jsp"></c:import>
<div id="content">
	<div class="aux">
	<h2>게시글 목록</h2>
	<p class="no_article">
	아직 게시글이 없습니다.
	</p>
	<ul id="articleList">
		<li class="article">
			<a href="article.html">
				<div class="card_user">
					<img src="/profile/profile.jpg" width="100" />
					<strong>테스터</strong>
				</div>
				<h3 class="title">
				제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
				</h3>
				<time>20분 전</time>
				<strong class="comment"><i class="fa fa-comment"></i> 21222</strong>
				<span class="hit"><i class="fa fa-eye"></i> 100</span>
				<div class="btn_like">
					<i class="fas fa-heart"></i>
					<i class="far fa-heart"></i>
					<span class="screen_out">좋아요</span>
					<strong class="num_like">1000</strong>
				</div>
			</a>
		</li>
		<li class="article">
			<a href="/article.html">
				<div class="card_user">
					<img src="/profile/profile.jpg" width="100" />
					<strong>테스터</strong>
				</div>
				<h3 class="title">
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
					제목입니다.제목입니다.제목입니다.
				</h3>
				<time>20분 전</time>
				<strong class="comment"><i class="fa fa-comment"></i> 21222</strong>
				<span class="hit"><i class="fa fa-eye"></i> 100</span>
				<div class="btn_like">
					<i class="fas fa-heart"></i>
					<i class="far fa-heart"></i>
					<span class="screen_out">좋아요</span>
					<strong class="num_like">1000</strong>
				</div>
			</a>
		</li>
	</ul>
	<div class="paginate">
		<!-- 이전 페이지 이동 :  비활성 -->
		<span title="이전 페이지 없음"><i class="fa fa-chevron-left"></i></span>
		<!-- 이전 페이지 이동 :  활성 -->
		<a href='' title="이전 페이지로"><i class="fa fa-chevron-left"></i><span class="screen_out">이전 페이지</span></a>
		<!-- 페이지들 -->
		<a href="" title="1">1</a>
		<a href="" title="2">2</a>
		<strong title="현재 3페이지">3</strong>
		<a href="" title="4">4</a>
		<a href="" title="5">5</a>
		<!-- 다음 페이지 이동 :  활성 -->
		<a href='' title="다음 페이지로"><i class="fa fa-chevron-right"></i><span class="screen_out">다음 페이지</span></a>
		<!-- 다음 페이지 이동 :  비활성 -->
		<span title="다음 페이지 없음"><i class="fa fa-chevron-right"></i></span>
	</div><!--//paginate-->

	<div class="box_btn">
		<a href="/writeArticle.html" class="btn">글쓰기</a>
	</div>
	</div><!--//aux -->
</div><!--//content-->
<c:import url="/WEB-INF/template/footer.jsp"></c:import>
</body>
</html>
