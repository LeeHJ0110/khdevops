<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>EditPw</h1>
   
   <hr>
   
    <form action="/member/editPw" method="post">
        <input type="password" name="userPw" placeholder="비밀번호">
        <br>
        <input type="submit" value="비밀번호 변경">
    </form>
</body>
</html>