<%@page import="com.kh.app.pokemon.PokemonTrainerVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/static/css/list.css">
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
	<main>
	<form action="/pokemon/list">
		<label>검색: </label>
		<input type="text" name="searchText">
	</form>
	
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>트레이너</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<PokemonTrainerVo> voList = (List<PokemonTrainerVo>) request.getAttribute("voList");
			for(PokemonTrainerVo vo : voList){
				pageContext.setAttribute("vo", vo);
			%>
				<tr>
					<td>${vo.no}</td>
					<td><a href="/pokemon/detail?no=${vo.no}">${vo.name}</a></td>
					<td>${vo.trainer}</td>
				</tr>
			<%}%>
		</tbody>
	</table>
	</main>
</body>
</html>