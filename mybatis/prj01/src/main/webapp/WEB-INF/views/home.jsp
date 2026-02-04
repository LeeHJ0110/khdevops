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
	<hr>
	<h2>${empty loginMemberVo.nick ? "게스트" : loginMemberVo.nick}님 환영합니다</h2>
	
	<a href="/member/join">회원가입</a>
	<br>
	<a href="/member/login">로그인</a>
	<br>
	<a href="/member/logout">로그아웃</a>
</body>
</html>