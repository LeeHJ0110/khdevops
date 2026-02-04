<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<link rel="stylesheet" href="/static/css/header.css">
	
	<header>
		<div>로고</div>
		<div>광고</div>
		<div id="loginArea">
		<%if(session.getAttribute("loginMemberVo") == null){%>
			<form action="/member/login" method="post">
				<input type="text" name="userId" placeholder="아이디">
				<input type="submit" value="로그인">
				<input type="password" name="userPw" placeholder="비밀번호">
				<a href="/member/join">회원가입</a>
				<a href="/member/find">ID/PW 찾기</a>
			</form>
		<%}else{%>
			<div>
				${loginMemberVo.nick }님 환영합니다.
			</div>
		<%} %>
		</div>
	</header>
	<nav>
		<div><a href="/board/list">게시판</a></div>
		<div><a href="/notice/list">공지사항</a></div>
		<div><a href="/gallery/list">갤러리</a></div>
		<div><a href="/member/mypage">마이페이지</a></div>
	</nav>
	
	<c:if test="${not empty alertMsg}">
		<script>
			alert("${alertMsg}")
		</script>
	</c:if>
	<c:remove var="alertMsg"/>
