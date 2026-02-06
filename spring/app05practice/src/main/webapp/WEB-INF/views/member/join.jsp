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
    <button onclick="f01();">회원가입</button>
    <input type="text" name="id">
    <input type="text" name="pw">
    <input type="text" name="nick">
    <script>
        function f01(){
        const id = document.querySelector("#id").value;
        const pw = document.querySelector("#pw").value;
        const nick = document.querySelector("#nick").value;
        const url = "http://127.0.0.1:8080/member/join?id=${id}"
        const option = {
            method : "post",
        };
        fetch(url, option);
        }
    </script>
</body>
</html>