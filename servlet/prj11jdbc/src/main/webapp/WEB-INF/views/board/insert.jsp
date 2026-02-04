<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>boardInsert</h1>
    <form action="/app/board/insert" method="post">
        <input type="text" name="title" placeholder="제목">
		<br>
		<textarea name="content" name="content"></textarea>
		<br>
		<input type="submit" value="저장하기">
    </form>
</body>
</html>