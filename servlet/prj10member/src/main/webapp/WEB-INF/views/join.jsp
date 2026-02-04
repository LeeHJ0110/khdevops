<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/css/join.css">
<script defer src="/app/js/join.js"></script>
</head>
<body>
	<h1>join</h1>
	<form action="/app/member/join" method="post">
		<input type="text" name="userId" placeholder="아이디">
		<br>
		<input type="text" name="userPw" placeholder="비밀번호">
		<br>
		<input type="text" name="userNick" placeholder="닉네임">
		<br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>