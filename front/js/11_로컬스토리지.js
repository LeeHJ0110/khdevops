
// localStorage.setItem("menu", "chicken");
// localStorage.setItem("price", 23000);

// const x = localStorage.getItem("menu");
// const y = localStorage.getItem("price")
// console.log(x);
// console.log(y);

// localStorage.clear();

// const str = `{"num": 123}`;
// const obj = {num: 123};
// const obj2 = JSON.parse(str);

// console.log(str);
// console.log(obj);
// console.log(obj2);

// const str2 = JSON.stringify(obj);
// console.log(str2);

const title = "해리포터";
const price = 3000;
const obj = {
    "title" : title,
    "price" : price,
};

localStorage.setItem("book",JSON.stringify(obj));
const voStr = localStorage.getItem("book");
const vo = JSON.parse(voStr);
console.log(vo);

