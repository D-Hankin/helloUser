const username = localStorage.getItem("username");
const skullIcon =  document.getElementsByClassName("skullIcon");
const noEntry = document.getElementsByClassName("noEntry");
const logOutBtnMembers = document.getElementById("logOutBtnMembers");
const removeBtn = document.getElementById("removeBtn");
const scream = document.getElementById("scream");

if (username == "admin") {
    body.style.backgroundImage='url("demon.png")';
    body.style.color="gold";
    for (let i = 0; i < noEntry.length; i++) {
        noEntry[i].src = "";
    }
}
else {
    logOutBtnMembers.disabled ="true";
    addMemberLink.style.display="none";
    for (let i = 0; i < skullIcon.length; i++) {
        skullIcon[i].src = "";
    }
}

logOutBtnMembers.addEventListener("click", function() {
    localStorage.clear();
    location.replace(location.href="/");
})

removeBtn.addEventListener("click", function() {
    scream.play();
    console.log("scream");
})
