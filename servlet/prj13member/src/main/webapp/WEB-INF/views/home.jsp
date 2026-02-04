<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>HOME</h1>
	<h2>${loginMemberVo == null ? "게스트" : loginMemberVo.nick}님 환영합니다</h2>
</body>
</html>