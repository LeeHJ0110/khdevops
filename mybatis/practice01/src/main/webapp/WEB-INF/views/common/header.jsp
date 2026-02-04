<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="/static/css/header.css">
    
    <header>
		<div></div>
		<div>
			<button id="logo" onclick="location.href='/home'">HOME</button>
		</div>
		<div id="loginArea">
			<% if(session.getAttribute("loginTrainerVo") == null){ %>
				<form action="/trainer/login" method="post">
					<input type="text" name="userId" placeholder="아이디">
					<input type="submit" value="로그인">
					<input type="password" name="userPw" placeholder="비밀번호">
					<a href="/trainer/join">트레이너 가입</a>
					<a href="/trainer/find">ID/PW 찾기</a>
				</form>
			<% }else{ %>
				<div>
					<div>${loginTrainerVo.nick}님 환영합니다.</div>
					<div><a href="/trainer/logout">트레이너 로그아웃</a><div>
				</div>
			<% } %>
		</div>
	</header>
	
	<nav>
		<div><a href="/pokemon/list">포켓몬 리스트</a></div>
		<div><a href="/pokemon/detail">포켓몬 상세정보</a></div>
		<div><a href="/pokemon/insert">포켓몬 추가</a></div>
		<div><a href="/trainer/mypage">마이페이지</a></div>
	</nav>
	
	<% if(session.getAttribute("alertMsg") != null){ %>
		<script>
			alert("${alertMsg}");
		</script>
	<% } %>
	<% session.removeAttribute("alertMsg"); %>