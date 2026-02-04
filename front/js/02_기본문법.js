//자료형
// function typeTest(){
//     let x;
//     console.log(typeof(x));
    
// }

// typeTest();

// function plusTest(){
//     const x = 3 + 3 + "3";
//     console.log(x);
    
// }
// plusTest();

// function castingTest(){
//     const x = parseInt(10);
//     console.log(typeof(x));
// }
// castingTest();

// function operTest(){
//     const x= 10;
//     const y = "20";
//     console.log(x !== y);
// }
// operTest();

function forInTest(){
    const arr = [100,200,300];

    // for(let i = 0 ; i < arr.length; i++){
    //     console.log(arr[i]);
    // }

    // for(const i in arr){
    //     console.log(arr[i]);
    // }
    
    for(const x of arr){
        console.log(x);
    }
}
forInTest();
