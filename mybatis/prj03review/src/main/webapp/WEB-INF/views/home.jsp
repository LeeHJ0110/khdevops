<%@page import="com.kh.app.member.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HOME</h1>
	<h2>${empty loginMemberVo.nick ? "게스트" : loginMemberVo.nick}님 환영합니다</h2>
	<hr>
	
	<%if(session.getAttribute("loginMemberVo") == null){%>
		<a href="/member/join">회원가입</a>
		<br>
		<a href="/member/login">로그인</a>
	<%}else{%>
		<a href="/member/mypage">마이페이지</a>
		<br>
		<a href="/member/editPw">비밀번호 수정</a>
		<br>
		<a href="/member/editNick">닉네임 수정</a>
		<br>
		<a href="/member/logout">로그아웃</a>
		<br>
		<a href="/member/quit">회원탈퇴</a>
	<%}%>
</body>
</html>