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