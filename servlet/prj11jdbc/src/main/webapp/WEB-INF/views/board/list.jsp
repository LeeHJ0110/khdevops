<%@page import="com.kh.app.board.BoardVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 목록</h1>
    <table>
        <thead></thead>
        <tbody>
        	<%
        		ArrayList<BoardVo> voList = (ArrayList<BoardVo>)request.getAttribute("voList");
        		for(BoardVo vo : voList){
					out.write("<tr>");
					out.write("<td>" + vo.getNo() + "</td>");
					out.write("<td>" + vo.getTitle() + "</td>");
					out.write("<td>" + vo.getHit() + "</td>");
					out.write("</tr>");
        		}
        	%>
        </tbody>
        <tfoot></tfoot>
    </table>
</body>
</html>