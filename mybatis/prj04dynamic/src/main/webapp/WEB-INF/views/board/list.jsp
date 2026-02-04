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

   <h1>게시글 조회하기</h1>

   <hr>
   <form action="/board/list" method="get">
   	<select name="searchType">
   		<option value="1">제목</option>
   		<option value="2">내용</option>
   		<option value="3">제목 또는 내용</option>
   	</select>
   	<br>
   	<input type="text" name = "t" placeholder = "검색할 제목">
   	<br>
   	<input type="text" name = "c" placeholder = "검색할 내용">
   	<br>
	<input type="submit">
   </form>
   
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


























