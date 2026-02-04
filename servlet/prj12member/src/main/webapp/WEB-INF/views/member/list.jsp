<%@page import="java.util.ArrayList"%>
<%@page import="com.kh.app.member.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member List</h1>
    <table>
        <thead></thead>
        <tbody>
        	<%
        		ArrayList<MemberVo> voList = (ArrayList<MemberVo>)request.getAttribute("voList");
        		for(MemberVo vo:voList){
	        		out.write("<tr>");
	        		out.write("<td>" + vo.getNo() + "</td>");
	        		out.write("<td>" + vo.getId() + "</td>");
	        		out.write("<td>" + vo.getNick() + "</td>");
	        		out.write("</tr>");
        		}
        	%>
        </tbody>
        <tfoot></tfoot>
    </table>
</body>
</html>