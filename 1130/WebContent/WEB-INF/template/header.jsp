<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="header">
	<h1><a href="/index.html"><img src="/img/logo.png" width="40"/><strong>ODEL2</strong> Board</a></h1>

        <div id="loginBox">
            <h2 class="screen_out">유저정보</h2>
            <img src="/profile/profile.jpg" width="60" height="60" alt="테스터" title="테스터"/>
            <a href="/logout.html" class="btn">로그아웃</a>
        </div><!--// loginBox  -->
	<!-- 로그아웃이 되어있으면 보여주는 박스 -->
	<!--<div id="logoutBox">
		<h2 class="screen_out">로그인</h2>
		<form action="login.html" method="post">
			<fieldset>
				<legend class="screen_out">로그인 폼</legend>
					<label for="id" class="screen_out">아이디</label>
					<input type="text" placeholder="아이디"
						   id="id" tabindex="1"
						   accesskey="i"
						   name="id"/>
					<label for="pwd" class="screen_out">비밀번호</label>
					<input type="password" accesskey="p"
						   placeholder="비밀번호"
						   id="pwd" name="pwd" tabindex="2" />
					<button class="btn" accesskey="l"
							tabindex="3" type="submit">로그인</button>
					<a href="joinForm.html" tabindex="4" accesskey="j"
					   class="join">회원가입</a>
			</fieldset>
		</form>
	</div><!--// logoutBox -->
</div>