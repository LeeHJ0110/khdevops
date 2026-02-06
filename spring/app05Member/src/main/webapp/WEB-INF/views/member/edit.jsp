<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>
    <script defer src="http://127.0.0.1:8080/js/member/edit.js"></script>
</head>
<body>
    <h1>Edit</h1>
    <hr>
    <form action="/member">
        <input type="text" name="nick" placeholder="닉네임">
        <br>
        <input type="submit" value="닉네임 변경" onclick="f01(event);">
    </form>
</body>
</html>