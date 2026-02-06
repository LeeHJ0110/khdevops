function f01(evt){
    evt.preventDefault();
    const nick = document.querySelector("input[name=nick]").value;

    const x ={nick}

    fetch("http://127.0.0.1:8080/member",{
        method : "put",
        headers : {"Content-Type" : "application/json"},
        body : JSON.stringify(x),
    })
    .then((resp)=>{return resp.json()})
    .then((data)=>{
        if(data === 1){
            alert("변경 성공")
            location.href="http://127.0.0.1:8080/home"
        }
        else{
            alert("변경 실패")
        }
    })


}