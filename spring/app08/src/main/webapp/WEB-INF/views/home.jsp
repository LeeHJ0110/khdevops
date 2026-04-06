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
    <hr>
    <%if(session.getAttribute("loginMemberVo") != null){%>
        <h3>${loginMemberVo.nick} 님 환영합니다</h3>
        <img src="http://192.168.20.209:5500/${loginMemberVo.profile}" alt="${loginMemberVo.originName}">
    <%}else{%>
        <h3>GUEST 님 환영합니다</h3>
    <%}%>
</body>
</html>