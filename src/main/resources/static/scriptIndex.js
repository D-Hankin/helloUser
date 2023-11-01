const usernameInput = document.getElementById("username");
const passwordInput = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let loggedInCheck = localStorage.getItem("username") + localStorage.getItem("password");
const addMemberLink = document.getElementById("addMemberLink");
const logOutBtn = document.getElementById("logOutBtn");
const body = document.getElementById("body");

if (loggedInCheck != "adminadmin") {
    addMemberLink.style.display="none";
    logOutBtn.disabled="true";
}
else {
    loginBtn.disabled="true";
}

loginBtn.addEventListener("click", (e) => {
    e.preventDefault();

    let username = usernameInput.value;
    let password = passwordInput.value;

    if (username == "admin" && password == "admin") {
        alert("Welcome back Overlord.");
        localStorage.setItem("username", username);
        localStorage.setItem("password", password);
        location.replace(location.href="/");
    }
    else {
        alert("YOU may not enter.");
    }
})

let username = localStorage.getItem("username");
if (username == "admin") {
    body.style.backgroundImage='url("demon.png")';
    body.style.color="gold";
}

logOutBtn.addEventListener("click", (e) => {
    e.preventDefault();
    localStorage.clear();
    location.reload();
})
