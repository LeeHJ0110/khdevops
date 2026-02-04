const btn01 = document.querySelector("#btn01");
btn01.addEventListener("click" , f01);

function f01(){
    // window.open();
    // window.open("https://www.naver.com/", "naver");
    window.open("https://www.naver.com/", "naver", "width=500, height=500");

}

function testTimeout(){
    const temp = window.open("https://www.naver.com/", "naver", "width=500, height=500");

    setTimeout(()=>{
        console.log("팝업창 닫기");
        temp.close();
    },3000)
    
}
let x;
function testInterver(){
    x = setInterval(()=>{
        console.log("hello");
        
    }, 3000)
}
function testClearInterver(){
    clearInterval(x);
}

function testLocation(){
    console.log("location: ", location);
    location.href = "https://www.naver.com/";
}

function testhistory(){
    history.forward();
    
}

function testNavicator(){
    console.log(navigator);
    
}

function testScreen(){
    console.log(screen);
    
}