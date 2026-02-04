function f01(){
    const x = {
        "my name": "홍길동",
        age: 20,
        hobby: ["코딩", "프로그래밍", "개발"],
        hello:function(){
            console.log("안녕하세요");
            
        }
    };

    console.log(x["my name"]);
    console.log(x.age);
    console.log(x["hobby"][2]);
    x.hello();

    x.height = 180;
    x.weight = 42;
    
    console.log(x);
    
}
// f01();

function f02(){
    const p1 = {
        name:"카리나",
        age:22
    }
    const p2 = {
        name:"윈터",
        age:23
    }
    const p3 = {
        name:"지젤",
        age:23
    }
    const p4 = {
        name:"닝닝",
        age:21
    }
    const aesap = [p1,p2,p3,p4];
    console.log(aesap);
    
}
// f02();

function f03(){
    p1 = new Member("카리나", 20);
    p2 = new Member("윈터", 21);
    p3 = new Member("지젤", 20);
    p4 = new Member("닝닝", 23);

    p1.sing();

    Member.prototype.dance = function(){
        console.log(`${this.name}의 춤추기`);
    };
    p1.dance();
    p2.dance();
    
}
// f03();
function Member(name, age){
    this.name = name;
    this.age = age;

    this.sing = function(){
        console.log(`${name}의 노래하기`);
        
    }
}


function f04(){
    const x = new IdolGroup("아이돌");
    console.log(x.getName());
    
}
f04();

function IdolGroup(a){
    let name = a;
    this.getName = function(){
        return name;
    };
    this.setName = function(n){
        name = n;
    }
}

function Hello(){}
const a = new Hello();
const b = new Hello();
const c = new Hello();

Hello.prototype.nick = "김프로";
a._proto_.hi = ()=>{
    console.log(`${nick}이야`);
}
a.hi();

