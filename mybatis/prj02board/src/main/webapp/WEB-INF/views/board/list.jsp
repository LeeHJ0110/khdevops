<%@page import="com.kh.app.board.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트</h1>
	
	<hr>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<%
	         List<BoardVo> voList = (List<BoardVo>) request.getAttribute("voList");
	         for(BoardVo vo : voList){
	            pageContext.setAttribute("vo", vo);
	         %>
	            <tr>
	               <td>${vo.no}</td>
	               <td><a href="/board/detail?no=${vo.no}">${vo.title}</a></td>
	               <td>${vo.hit}</td>
	            </tr>
	         <%}%>
		</tbody>
	</table>
</body>
</html>