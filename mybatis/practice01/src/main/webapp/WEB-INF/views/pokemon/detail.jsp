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
		<label>번호 : ${vo.no}</label>
		<br>
		<label>이름 : ${vo.name}</label>
		<br>
		<label>타입 : ${vo.type}</label>
		<br>
		<label>특성 : ${vo.ability}</label>
		<br>
		<label>트레이너 : ${vo.trainer}</label>
		<br>
	</main>
</body>
</html>