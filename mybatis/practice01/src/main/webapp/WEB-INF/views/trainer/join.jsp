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
		<h1>트레이너 가입</h1>
	    <form action="/trainer/join" method="post">
	    	<label>아이디</label>
	    	<br>
	        <input type="text" name="userId" placeholder="아이디">
	    	<br>
			<label>비밀번호</label>
	        <br>
	        <input type="password" name="userPw" placeholder="비밀번호">
	        <br>
			<label>이름</label>
	        <br>
	        <input type="text" name="userNick" placeholder="홍길동">
	        <br>
	        <input type="submit" value="회원가입">
	    </form>
	</main>
</body>
</html>