function join(){
    const id = document.querySelector("#joinForm > input[name=id]").value;
    const pw = document.querySelector("#joinForm > input[name=pw]").value;
    const nick = document.querySelector("#joinForm > input[name=nick]").value;
    fetch(`http://127.0.0.1:8080/member/join` , {
        method : "post" ,
        headers : {
            "Content-Type" : "application/json"
        } ,
        body : JSON.stringify({id , pw , nick}),
    })
    .then( (resp)=> resp.json() )
    .then( (data)=>{ 
        if(data === 1){
            alert("회원가입 성공 !");
        }else{
            alert("회원가입 실패 ...");
        }
     } )
    ;
}

function login(){
    const id = document.querySelector("#loginForm > input[name=id]").value;
    const pw = document.querySelector("#loginForm > input[name=pw]").value;

    fetch(`http://127.0.0.1:8080/member/login` , {
        method : "post" ,
        headers : {
            "Content-Type" : "application/json"
        } ,
        body : JSON.stringify({id , pw}),
    })
    .then( (resp)=> resp.json() )
    .then( (data)=>{ 
        if(data.msg == "GOOD"){
            alert("로그인 성공");
        }else{
            alert("로그인 실패");
        }
     } )
    ;
}

function editNick(){
    const nick = document.querySelector("#editForm > input[name=nick]").value;

    fetch(`http://127.0.0.1:8080/member` , {
        method : "put" ,
        headers : {
            "Content-Type" : "application/json"
        } ,
        body : JSON.stringify({nick}),
    })
    .then( (resp)=> resp.json() )
    .then( (data)=>{ 
        if(data === 1){
            alert("이름 변경 성공 !");
        }else{
            alert("이름 변경 실패 ...");
        }
     } )
    ;
}

function quit(){
    fetch(`http://127.0.0.1:8080/member`,{
        method : "delete"
    })
    .then( (resp)=> resp.json() )
    .then( (data)=>{ 
        if(data === 1){
            alert("삭제 성공 !");
        }else{
            alert("삭제 실패 ...");
        }
     } )
    ;
}