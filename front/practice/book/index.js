function enrollBook(){
    const title = document.querySelector("input[name=title]").value;
    const price = document.querySelector("input[name=price]").value;

    let arr = JSON.parse(localStorage.getItem("bookVoList"));
    if(!arr){
        arr = [];
    }
    const vo = {title , price};
    arr.push(vo);
    
    localStorage.setItem("bookVoList" , JSON.stringify(arr) );
    alert("도서 등록 완료 !");
}

function selectBookVoList(){
    const arr = JSON.parse(localStorage.getItem("bookVoList"));

    const bookListDiv = document.querySelector("#bookList");
    let tableStr = "";
    tableStr += `<table border="1">`;
    for(const x of arr){
        tableStr += `
                <tr>
                    <td>${x.title}</td>
                    <td>${x.price}</td>
                </tr>
                `;
    }
    tableStr += `</table>`;
            
    bookListDiv.innerHTML = tableStr;
}