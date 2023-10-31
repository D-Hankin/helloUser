const usernameInput = document.getElementById("username");
const passwordInput = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let loggedInCheck = localStorage.getItem("username");
const addMemberLink = document.getElementById("addMemberLink");

if (loggedInCheck != "admin") {
    addMemberLink.style.display="none";
}

loginBtn.addEventListener("click", (e) => {
    console.log("click");
    e.preventDefault();

    let username = usernameInput.value;
    let password = passwordInput.value;

    if (username == "admin" && password == "admin") {
        alert("Welcome back Overlord.");
        localStorage.setItem("username", username)
        localStorage.setItem("password", password);
        console.log("successful log in.")
        location.reload();
    }
    else {
        alert("YOU may not enter.")
    }
})

const logOutBtn = document.getElementById("logOutBtn");

logOutBtn.addEventListener("click", (e) => {
    console.log("click");
    e.preventDefault();
    localStorage.clear();
    location.replace(location.href);
})