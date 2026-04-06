<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>

</head>
<body>

<h1>로그인</h1>

<hr>

    <input type="text" name="id">
    <br>
    <input type="password" name="pw">
    <br>
    <br>
    <input type="button" value="로그인" onclick="login();">

<script>
    function login(){
        const id = document.querySelector("input[name=id]").value;
        const pw = document.querySelector("input[name=pw]").value;

        fetch("http://127.0.0.1:8080/member/login",{
            method: "post",
            headers: {
                "Content-Type" : "application/json" ,
            },
            body: JSON.stringify({id,pw}),
        })
        .then(resp => resp.json())
        .then((data)=>{
            if(data.msg === "OK"){
                alert("로그인 성공");
                location.href = "/home";
            }else{
                alert("로그인 실패");
                location.href = "/error";
            }
        })
        ;
    }

</script>


</body>
</html>