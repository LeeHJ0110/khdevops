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
      <form action="/board/write" method="post">
         <input type="text" name="title" placeholder="제목을 입력하세요"> 
         <br>
         <textarea name="content" placeholder="내용을 입력하세요"></textarea>
         <br>
         <input type="submit" value="작성하기">
      </form>
   </main>

</body>
</html>