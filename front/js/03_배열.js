function f01(){
    const arr = ["java","html", "css"];
    arr[0] = 'one';
    console.log(arr);
    
}
// f01();

function f02(){
    const arr = ["바나나", "사과", "딸기", "레몬"]
    const arr2 = ["상추", "시금치", "고사리", "콩나물"];

    // const result = arr.indexOf("바나나");
    // console.log(result);
    
    // const result = arr.concat(arr2);
    // console.log(result);

    // const result = arr.join(", ")
    // console.log(result);
    
    // const result = arr.reverse();
    // console.log(result);

    // const result = arr.sort();
    // console.log(result);

    // arr.push("수박");
    // arr.push("배");
    // arr.push("오랜지");
    // console.log(arr);

    // const result = arr.pop();
    // console.log(result);
    // console.log(arr);
    
    // const result = arr.shift();
    // console.log(result);
    
    // arr.unshift("토마토");
    // console.log(arr);

    // const result = arr.slice(1,3);
    // console.log(result);
    
    const result = arr.splice(2,1,"아니");
    console.log(result);
    console.log(arr);
    

}
f02();