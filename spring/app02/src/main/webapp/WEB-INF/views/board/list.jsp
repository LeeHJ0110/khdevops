<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>


</head>
<body>
    <h1>게시글 목록</h1>
    <hr>
    <table>
        <thead>
            <tr>
                <td>번호</td>
                <td>제목</td>
                <td>조회수</td>
            </tr>
        </thead>
        <tbody>
            ${voList}
        </tbody>
    </table>
</body>
</html>