<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>트레이너 로그인</h1>
	<form action="/app/pokemon/login" method="post">
		<label>ID</label>
		<br>
		<input type="text" name="id" placeholder="아이디를 입력해주세요">
		<br>
		<label>PassWord</label>
		<br>
		<input type="password" name="pw">
		<br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>