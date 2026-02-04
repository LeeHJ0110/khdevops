/*
    RegExp 객체에서 제공하는 메소드
        객체.test(문자열) : 문자열에 정규식 패턴을 만족하는 값이 있으면 true, 없으면 false를 리턴한다.
        객체.exec(문자열) : 문자열에 정규식 패턴을 만족하는 값이 있으면 처음 매치된 문자열 리턴한다.
    
    String 객체에서 정규 표현식 객체를 이용하는 메소드
        문자열.match(정규식) : 문자열에서 정규식 패턴의 값과 일치하는 값을 리턴한다.
        문자열.replace(정규식, 바꿀값) : 문자열에서 정규식 패턴의 값과 일치하는 부분을 바꿀값으로 변경한다.
        문자열.search(정규식) : 문자열에서 정규식 패턴의 값과 일치하지 부분의 시작 인덱스를 리턴한다.
        문자열.split(정규식) : 문자열에서 정규식 패턴의 값과 일치하는 값을 구분자로 하여 배열을 생성하여 리턴한다.
*/

/*
    문자열의 앞, 뒤 구분
    {...}에서
    ^는 문자열의 시작
    $는 문자열의 마지막
*/

/*
    OR 검색
    [...] 내의 문자들 중 하나라도 존재할 경우를 의미한다.
    [...] 내의 ^는 not의 의미를 가진다.
    [...] 내의 -는 범위 지정을 의미한다.
*/  

/* 
    임의의 문자열 검색
    .은 임의의 문자 한 개를 의미하고, 문자 내용은 무엇이든 상관없다.
*/

/*
    \d : 숫자를 의미한다.
    \D : 숫자가 아닌 문자를 의미한다.
    \w : 알파벳, 숫자, 언더 스코어(_)를 의미한다.
    \W : 알파벳, 숫자, 언더 스코어(_)가 아닌 문자를 의미한다.
    \s : 공백 문자를 의미한다. (띄어쓰기, 탭, 줄바꿈)
    \S : 공백 문자가 아닌 문자를 의미한다.
*/


// const re01 = new RegExp("low");
const re01 = /H/i;
const str = "nano banana    123"

const result = str.replace(/\s/ig, "X");
console.log(result);

function checkValid(){
    const userId = document.querySelector("input[name=userId]").value;
    const userPw = document.querySelector("input[name=userPw]").value;
    const userNick = document.querySelector("input[name=userNick]").value;

    const idRegExp = /^[a-z0-9]{4,8}$/;
    const pwRegExp = /^(?=.*[A-Z])(?=.*[^A-Za-z0-9]).{4,12}$/;
    const nickRegExp = /^[가-힣]{2,4}$/;
    
    if(!idRegExp.test(userId)){
        alert("아이디 잘못됨");
        return false;
    }
    if(!pwRegExp.test(userPw)){
        alert("비밀번호 잘못됨");
        return false;
    }
    if(!nickRegExp.test(userNick)){
        alert("닉네임 잘못됨");
        return false;
    }


}