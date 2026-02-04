<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>LOGIN</h1>
   
   <hr>
   
    <form action="/member/login" method="post">
        <input type="text" name="userId" placeholder="아이디입력">
        <br>
        <input type="password" name="userPw" placeholder="비밀번호">
        <br>
        <input type="submit" value="로그인">
    </form>
</body>
</html>