async function loadBoardVo(){
    const boardNo = location.pathname.split("/").pop();
    const resp = await fetch(`/board/${boardNo}`);

    if(!resp.ok){
        throw new Error("loadBoardVo fail ...");
    }

    const data = await resp.json();
    const vo = data.vo;
    const likeStatus = data.likeStatus;
    const likeCount = data.likeCount;

    const btnLike = document.querySelector("#btn-like");
    if(likeStatus){
        btnLike.innerHTML = "♥";
    }else{
        btnLike.innerHTML = "♡";
    }

    document.querySelector("#writerNick").innerHTML = vo.writerNick;
    document.querySelector("#hit").innerHTML = vo.hit;
    document.querySelector("#likeCount").innerHTML = likeCount;
    document.querySelector("#createdAt").innerHTML = vo.createdAt;
    document.querySelector("main input[name=title]").value = vo.title;
    document.querySelector("main textarea[name=content]").value = vo.content;
}

try {
    loadBoardVo();    
} catch (error) {
    console.log(error);
    alert("게시글 상세조회 실패 ...");
}


function moveToEditPage(){
    const no = location.pathname.split("/").pop();
    location.href = `/board/edit/${no}`;
}

async function insertReply(){
    try {
        const content = document.querySelector("textarea[name=reply-content]").value;
        const boardNo = location.pathname.split("/").pop();

        const resp = await fetch(`/api/board/reply` , {
            method : "POST" ,
            headers : {
                "Content-Type" : "application/json" ,
            } ,
            body : JSON.stringify( {content , boardNo} ) ,
        });

        if(!resp.ok){
            throw new Error("errrorrrrr reply inserttt rerrorrrr");
        }

        const data = await resp.json();

        if(data.result != 1){
            alert("fail ... ");
        }

        alert("댓글 등록 성공 !");
        loadReply();
    } catch (error) {
        console.log(error);
    }

}


async function loadReply(){
    const boardNo = location.pathname.split("/").pop();

    const resp = await fetch(`/api/board/reply?boardNo=${boardNo}`);

    if(!resp.ok){
        throw new Error("laod reply error");
    }

    const voList = await resp.json();
    let str = "";
    for(const vo of voList){
        str += `
            <div>
                <span>${vo.no}</span>
                <span>${vo.content}</span>
                <span>${vo.writerNick}</span>
                <span>${vo.createdAt}</span>
                <button onclick="del(${vo.no});">삭제</button>
            </div>
        `;
    }
    const replyListArea = document.querySelector("#reply-list-area");
    replyListArea.innerHTML = str;
}

loadReply();

async function del(no){
    try {
        const resp = await fetch(`/api/board/reply` , {
            method : "delete" ,
            headers : {
                "Content-Type" : "application/json" ,
            } ,
            body : JSON.stringify( {no} ) ,
        });

        if(!resp.ok){
            throw new Error("reply delete fail ...");
        }

        const data = await resp.json();
        if(data != 1){
            alert("삭제실패 ...");
            throw new Error("reply delete fail ...");
        }

        alert("댓글 삭제 성공 !");
        location.reload();
    } catch (error) {
        console.log(error);
    }
}

async function like(){
    try {
        
        const boardNo = location.pathname.split("/").pop();
        const resp = await fetch(`/board/like/${boardNo}` , {
            method : "POST",
        });
    
        if(!resp.ok){
            throw new Error("like fail ...");
        }
    
        const data = await resp.json();
        const btnLike = document.querySelector("#btn-like");
        if(data.likeStatus){
            btnLike.innerHTML = "♥";
        }else{
            btnLike.innerHTML = "♡";
        }
    
    } catch (error) {
        console.log(error);
    }
    
}