<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>

</head>
<body>
    <h1>HOME ~ !</h1>
    <form action="/pokemon/insert" method="post">
        <label>이름: </label>
        <input type="text" name="name" placeholder="아상해씨">
        <br>
        <label>타입: </label>
        <input type="text" name="type" placeholder="풀">
        <br>
        <label>특성: </label>
        <input type="text" name="ability" placeholder="심록">
        <br>
        <input type="submit" value="등록하기">
    </form>
</body>
</html>