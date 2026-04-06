<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>세미</title>
    <script defer src="/js/board/edit.js"></script>
</head>
<body>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<main>
    <h1>게시글 수정</h1>

    <form>
        <input type="hidden" name="no" value="${boardVo.no}">
        <input type="text" name="title" placeholder="제목을 입력하세요" value="${boardVo.title}">
        <br>
        <textarea name="content" placeholder="내용을 입력하세요">${boardVo.content}</textarea>
        <br>
        <input type="button" value="수정하기" onclick="edit();">
        <input type="button" value="삭제하기" onclick="del();">
    </form>
</main>

</body>
</html>