<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
	<main>
		<% if(session.getAttribute("loginTrainerVo") == null){%>
		<h1>HOME</h1>
		<%}else{ %>
		<h1>${loginTrainerVo.nick}님 환영합니다</h1>
		<%}%>
	</main>
	
</body>
</html>