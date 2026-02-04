<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/static/css/member/join.css">
</head>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp" %>
	
   <main>
      <h1>회원가입</h1>
   
       <form action="/member/join" method="post">
           <input type="text" name="userId" placeholder="아이디입력">
           <br>
           <input type="password" name="userPw" placeholder="비밀번호">
           <br>
           <input type="text" name="userNick" placeholder="닉네임">
           <br>
           <input type="submit" value="회원가입">
       </form>
   </main>

</body>
</html>