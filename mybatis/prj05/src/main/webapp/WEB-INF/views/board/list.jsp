<%@page import="com.kh.app.board.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/static/css/board/list.css">
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
	<main>
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${voList }" var="vo">
                  <tr>
                     <td>${vo.no}</td>
                     <td>${vo.title}</td>
                     <td>${vo.writerNick}</td>
                     <td>${vo.hit}</td>
                  </tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<button onclick="location.href=`/board/write`">게시글 작성</button>
	</main>
</body>
</html>