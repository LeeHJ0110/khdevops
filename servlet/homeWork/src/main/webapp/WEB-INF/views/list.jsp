<%@page import="com.kh.app.PokemonVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/css/layout.css">
</head>
<body>
	<h1>${loginTrainerVo.name}님 반가워요</h1>
	<table>
		<thead>
			<tr>
				<th>포켓몬 이름</th>
				<th>타입</th>
				<th>레벨</th>
				<th>트레이너</th>
			</tr>
		</thead>
		<tbody><%
			ArrayList<PokemonVo> voList = (ArrayList<PokemonVo>)request.getAttribute("voList");
			for(PokemonVo vo : voList){
				out.write("<tr>");
				out.write("<td>"+vo.getName()+"</td>");
				out.write("<td>"+vo.getType()+"</td>");
				out.write("<td>"+vo.getLevel()+"</td>");
				out.write("<td>"+vo.getOwner()+"</td>");
				out.write("</tr>");
			}
		%></tbody>
		<tfoot></tfoot>
	</table>
	<h2>검색</h2>
	<form action="/app/pokemon/list" method="post">
		<input type="text" name="owner" placeholder="한지우">
		<br>
		<input type="submit" value="검색하기">
	</form>
	<br>
	<form action="/app/pokemon/insert" method="get">
		<input type="submit" value="포켓몬 등록하기">
	</form>
	<form action="/app/pokemon/login" method="get">
		<input type="submit" value="로그인">
	</form>
	<form action="/app/pokemon/join" method="get">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>