async function edit(){

    try {
        const title = document.querySelector("main input[name=title]").value;
        const content = document.querySelector("main textarea[name=content]").value;
        const no = document.querySelector("main input[name=no]").value;

        const resp = await fetch(`/board` , {
            method : "PUT" ,
            headers : {
                "Content-Type" : "application/json" ,
            } ,
            body : JSON.stringify( {title, content, no} ) ,
        });

        if(!resp.ok){
            throw new Error("board edit fail ...");
        }

        const data = await resp.json();
        console.log("data : " , data);


        if(data.result != "1"){
            throw new Error("board edit fail ...");
        }

        alert("게시글 수정 완료 !");
    } catch (error) {
        location.href = `/home`;
        console.log(error);
    }

}

async function del(){
    try {
        const no = document.querySelector("main input[name=no]").value;

        const resp = await fetch(`/board` , {
            method : "delete" ,
            headers : {
                "Content-Type" : "application/json" ,
            } ,
            body : JSON.stringify( {no} ) ,
        });

        if(!resp.ok){
            throw new Error("fail to delete ...");
        }

        const data = await resp.json();
        if(data.result != 1){
            throw new Error("fail to delete ...");
        }

        alert("게시글 삭제 완료 !");
        location.href = "/board/list";
    } catch (error) {
        location.href=`/home`;
        console.log(error);

    }
}