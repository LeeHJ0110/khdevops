<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/css/layout.css">
</head>
<body>
	<h1>포켓몬 입력</h1>
	<form action="/app/pokemon/insert" method="post">
		<label>포켓몬 이름</label>
		<br>
		<input type="text" name="name" placeholder="이상해씨">
		<br>
		<label>타입</label>
		<br>
		<input type="text" name="type" placeholder="풀">
		<br>
		<label>레벨</label>
		<br>
		<input type="text" name="level" placeholder="6">
		<br>
		<label>트레이너</label>
		<br>
		<input type="text" name="owner" placeholder="한지우">
		<br>
		<input type="submit" value="입력하기">
	</form>
</body>
</html>