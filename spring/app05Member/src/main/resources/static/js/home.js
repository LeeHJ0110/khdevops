function f01(evt){
    evt.preventDefault();

    fetch("http://127.0.0.1:8080/member",{
        method : "delete",
        headers : {"Content-Type" : "application/json"},
    })
        .then((resp)=>{return resp.json()})
        .then((data)=>{
            if(data === 1){
                alert("탈퇴 성공")
                location.href="http://127.0.0.1:8080/home"
            }
            else{
                alert("탈퇴 실패")
            }
        })


}