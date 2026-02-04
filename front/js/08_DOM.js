
function createNode01(){
    //h1 노드 만들기
    const ele = document.createElement("h1");
    //안녕 노드 만들기
    const txt = document.createTextNode("안녕");
    //안녕 노드를 h1 노드의 자식으로 넣기
    ele.appendChild(txt);
    //result01 노드의 자식으로 h1노드 넣기
    const result01 = document.querySelector("#result01");
    result01.appendChild(ele);
}

function createNode02(){
    const imgTag = document.createElement("img")
    imgTag.setAttribute("src", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7OrtM7FfDgFfgOmRqL4R__bU5cjx1ltwy1A&s")
    imgTag.width = "50";
    imgTag.height = "50";
    const result02 = document.querySelector("#result02");
    result02.appendChild(imgTag)
}

function removeNode01(){
    const x = document.querySelector("#result01").children;
    x[0].remove();
    
}
function removeNode02(){
    // const x = document.querySelector("#result02").children;
    // x[0].remove();
    const result02 = document.querySelector("#result02");
    result02.innerHTML = "";
    
}