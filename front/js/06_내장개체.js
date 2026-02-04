function f01(){
    const x = new Date();
    console.log(x.getFullYear());
    console.log(x.getMonth());
    console.log(x.getDate());
    console.log(x.getDay());
    console.log(x.getHours());
    
    const result = x instanceof Date;
    console.log(result);
    
}
f01();