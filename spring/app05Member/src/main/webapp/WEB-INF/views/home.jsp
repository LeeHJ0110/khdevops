<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>
    <script defer src="http://127.0.0.1:8080/js/home.js"></script>

</head>
<body>
    <h1>HOME ~ !</h1>
    <h2>${empty loginMemberVo ? "Guest" : loginMemberVo.nick}님 환영합니다</h2>
    <button onclick="f01(event);">탈퇴하기</button>
</body>
</html>