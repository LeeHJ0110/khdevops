<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>

</head>
<body>

<h1>회원가입</h1>

<hr>

    <input type="text" name="id">
    <br>
    <input type="password" name="pw">
    <br>
    <input type="text" name="nick">
    <br>
    <input type="file" name="f" onchange="preview(event);">
    <div id="preview-area"></div>
    <br>
    <input type="button" value="회원가입" onclick="join();">

<script>
    function join(){
        const fd = new FormData();

        fd.append("id", document.querySelector("input[name=id]").value);
        fd.append("pw", document.querySelector("input[name=pw]").value);
        fd.append("nick", document.querySelector("input[name=nick]").value);
        fd.append("f", document.querySelector("input[name=f]").files[0]);

        fetch("http://127.0.0.1:8080/member/join",{
            method:"post",
            body : fd,
        })
        .then(resp => resp.json())
        .then((data)=>{
            if(data === 1){
                alert("회원가입 성공");
                location.href = "/home";
            }else{
                alert("회원가입 실패");
                location.href = "/error";
            }
        })
        ;
    }

    function preview(evt){
        const fileList = evt.target.files;
        const f = fileList[0];

        const fr = new FileReader();
        fr.addEventListener("load" , function (evt){
            const dataUrl = evt.target.result;
            document.querySelector("#preview-area").innerHTML = `<img src="${dataUrl}">`;
        });
        fr.readAsDataURL(f);

    }
</script>


</body>
</html>