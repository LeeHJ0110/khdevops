<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JOIN</h1>
   <hr>
   <a href="/home">HOME PAGE</a>
   
    <form action="/member/join" method="post">
        <input type="text" name="userId" placeholder="아이디입력">
        <br>
        <input type="password" name="userPw" placeholder="비밀번호">
        <br>
        <input type="text" name="userNick" placeholder="닉네임">
        <br>
        <input type="submit" value="회원가입">
    </form>
   
</body>
</html>