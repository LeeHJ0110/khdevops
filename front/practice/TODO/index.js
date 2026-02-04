// 입력 요청
function insertTodo(){
    // title 값 받아오기
    const title = document.querySelector("input[name=title]").value;
    // vo를 json 형식으로 생성
    const vo = {
        "title" : title ,
        "done" : true ,
        "created_at" : new Date() ,
    };

    // 기존 todoVoList를 객체로 변환해 저장
    let arr = JSON.parse(localStorage.getItem("todoVoList"));

    // 기존 todoVoList 없으면 생성
    if(!arr){arr = [];}
    arr.push(vo);

    // 객체 JSON 형식으로 변환 후 todoVoList에 입력
    localStorage.setItem("todoVoList" , JSON.stringify(arr));

    alert("등록 완료 !");
}

// 화면에 데이터들 보여주기
function displayVoList(){
    // 가져온 데이터 입력할곳
    const voListTable = document.querySelector("#voListTable");
    const tbody = voListTable.children[1];

    // 저장된 데이터들 호출
    const voList = JSON.parse(localStorage.getItem("todoVoList"));
    
    // 데이터 나열
    let str = "";
    for(let i = 0; i < voList.length; ++i){
        // 클릭시 상세내용 UI로 이동
        // 일괄삭제를 위한 checkbox에 click 이벤트 제외시키기
        str += `
        <tr onclick="displayVoDetail(${i});">
        <td> ${i} </td>
        <td> ${voList[i].title} </td>
        <td onclick="event.stopPropagation();"> <input type="checkbox" value="${i}"></td>
        </tr>
        `;
    }
    // 데이터 보여주기
    tbody.innerHTML = str;
}
// 상세내용 UI 요청
function displayVoDetail(no){
    
    // 저장된 no번째 데이터 호출
    const voList = JSON.parse(localStorage.getItem("todoVoList"));
    const vo = voList[no];
    
    // 상세 데이터 입력
    document.querySelector("#todoDetailNo").innerHTML = no;
    document.querySelector("#todoDetailTitle").innerHTML = vo.title;
    // 실시간 채크 내용 저장을 위해 onchange에 함수 등록
    document.querySelector("#todoDetailDone").innerHTML = `<input type="checkbox" ${vo.done ? "checked" : ""} onchange="saveDone();" >`;
    document.querySelector("#todoDetailCreatedAt").innerHTML = vo.created_at;

    // 상세내용 보여줄 div 활성화
    document.querySelector("#modal").classList.add("active");
}

//페이지 들어오면 실행
window.onload = function(){
    displayVoList();
}

// 상세내용 닫기 구현
function closeModal(){
    document.querySelector("#modal").classList.remove("active");
}

// 이벤트 제외시키기
function f01(evt){
    evt.stopPropagation();
}

// 내용 저장 요청
function saveDone(){
    // modal에서 현제 상태 가져오기
    const no = document.querySelector("#todoDetailNo").innerHTML;
    const done = document.querySelector("#todoDetailDone").children[0].checked;

    // 저장되어있는 데이터 가져오기
    const voList = JSON.parse(localStorage.getItem("todoVoList"));
    // 데이터중 modal이 보여주는 데이터의 done 갱신
    voList[no].done = done;
    
    // 객체 JSON 형식으로 변환 후 todoVoList에 입력
    localStorage.setItem("todoVoList" , JSON.stringify(voList));
}

// 단일 삭제 요청
function deleteTodo(no , event){
    // click 이벤트 제외
    event.stopPropagation();
    
    // 저장된 데이터 가져오기
    const voList = JSON.parse(localStorage.getItem("todoVoList"));
    // no 번째 배열 1개 잘라내기
    voList.splice(no , 1);
    
    
    // 객체 JSON 형식으로 변환 후 todoVoList에 입력
    localStorage.setItem("todoVoList" , JSON.stringify(voList));
    
    alert("삭제 완료 !");
    //UI 갱신
    displayVoList();
}

// 그룹 삭제 요청
function deleteTodo(){
    // tr태그들 가져오기
    const trTagList = document.querySelector("#voListTable").children[1].children;
    const targetNoArr = [];
    // 태그 내부 순환
    for(const trTag of trTagList){
        // tr 태그 내부 checkbox 가져오기
        const inputTag = trTag.children[2].children[0];
        // checked 되어 있는 것 targetNoArr에 저장
        if(inputTag.checked){
            targetNoArr.push(inputTag.value);
        }
    }
    
    //저장된 데이터 가져오기
    const todoVoList = JSON.parse(localStorage.getItem("todoVoList"));    
    
    // targetNoArr에 있는 tr태그 지우기
    targetNoArr.reverse();
    for(const no of targetNoArr){
        todoVoList.splice(no,1);
    }
    
    // 객체 JSON 형식으로 변환 후 todoVoList에 입력
    localStorage.setItem("todoVoList", JSON.stringify(todoVoList));
    //UI 갱신
    displayVoList();
}