

function handleEnroll(){

    const person = handleInput();

    createCard(person);
        
}

function handleInput(){
    const nick = document.querySelector("input[name=nick]").value.trim();
    const phone = document.querySelector("input[name=phone]").value.trim();

    if(nick === undefined || phone === undefined || nick === null || phone === null || nick.lenght <= 0 || phone.lenght <= 0){
        alert("데이터 문제 있음");
        
        return;
    }
    return {nick, phone};
}

function createCard(person){
    const {nick,phone} = person;
    const card = document.createElement("div");
    card.classList.add("card")

    const nickDiv = document.createElement("div");
    const phoneDiv = document.createElement("div");

    const nickNode = document.createTextNode(nick);
    const phoneNode = document.createTextNode(phone);
    
    nickDiv.appendChild(nickNode)
    phoneDiv.appendChild(phoneNode)

    card.appendChild(nickDiv);
    card.appendChild(phoneDiv);
    
    const cardArea = document.querySelector("#card-area");
    cardArea.appendChild(card)
}
