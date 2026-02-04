const btn11 = document.querySelector("#btn1-1");
const btn12 = document.querySelector("#btn1-2");
const btn13 = document.querySelector("#btn1-3");
const btn2 = document.querySelector("#btn2");
const loginBtn = document.querySelector("input[type=submit]")


btn11.onclick = () => {
    console.log("고전");
    
};
function f12(){
    console.log("인라인")
}
btn13.addEventListener("click", function(){
    console.log("표준");
    
});

// btn2.addEventListener("click", function(evt){
//     // evt.target.remove()
//     evt.target.style.backgroundColor = "red";
// });
function f2(t){
    console.log("f2 call");
    t.style.backgroundColor = "red";
    
}

function f32(evt){
    const userId = document.querySelector("input[name=userId]").value;
    const userPw = document.querySelector("input[name=userPw]").value;
    if(userId.length < 4){
        alert("아이디 너무 짧음");
        evt.preventDefault();
    }
    if(userPw.length < 4){
        alert("비밀번호 너무 짧음");
        evt.preventDefault();
    }
}
loginBtn.addEventListener("click",f32);



