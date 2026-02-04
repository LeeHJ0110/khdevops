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
		<h1>insert Pokemon</h1>
		<form action="/pokemon/insert" method="post">
			<label>포켓몬 이름</label>
	        <br>
	        <input type="text" name="pokeName" placeholder="이상해씨">
	        <br>
			<label>포켓몬 타입</label>
	        <br>
	        <input type="text" name="pokeType" placeholder="풀">
	        <br>
			<label>포켓몬 특성</label>
	        <br>
	        <input type="text" name="pokeAbil" placeholder="심록">
	        <br>
	        <input type="submit" value="포켓몬 등록">
	    </form>
	</main>
</body>
</html>