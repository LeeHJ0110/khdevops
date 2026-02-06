//Promise
const x = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        console.log("외부 API 호출");
        resolve("점심먹기");
    },1000);
});

x.then((data)=>{
    console.log("리졸브");
    throw new Error();
    
})
.then((str)=>{
    console.log(덴);
})
.catch(()=>{
    console.log("캐치");
    
})
;

x.catch(()=>{
    console.log("리젝트");
    
});


//AJAX

function f01(){
    const url = "http://127.0.0.1:8080/todo?title=코딩하기"
    const option = {
        method : "post",
    };
    fetch(url, option);
}
function f02(){
    fetch("http://127.0.0.1:8080/todo")
    .then( (resp)=>{return resp.json()})
    .then( (voList)=>{
        console.log(voList);
        
    });
}
function f03(){
    const todoNo = document.querySelector("#todoNo").value;
    
    fetch(`http://127.0.0.1:8080/todo/detail?no=${todoNo}`)
    .then((resp)=>{return resp.json()})
    .then((todoVo)=>{
        console.log(todoVo);
        
    })
    ;

}

function f04(){
    const todoNumer = document.querySelector("#todoNumer").value;
    fetch(`http://127.0.0.1:8080/todono=${todoNumer}`, {
        method : "put"
    });
}
function f05(){
    const todoNum = document.querySelector("#todoNum").value;
    fetch(`http://127.0.0.1:8080/todo?no=${todoNum}`, {
        method : "delete"
    });
}