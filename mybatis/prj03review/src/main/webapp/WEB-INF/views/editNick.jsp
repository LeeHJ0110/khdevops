<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>EditNick</h1>
   
   <hr>
   
    <form action="/member/editNick" method="post">
        <input type="text" name="userNick" placeholder="닉네임">
        <br>
        <input type="submit" value="닉네임 변경">
    </form>
</body>
</html>