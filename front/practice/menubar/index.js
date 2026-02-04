const asideTag = document.querySelector("aside")

asideTag.addEventListener("click", function(evt){
    evt.currentTarget.classList.toggle("active");
});