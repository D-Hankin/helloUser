const usernameInput = document.getElementById("username");
const passwordInput = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let loggedInCheck = localStorage.getItem("username") + localStorage.getItem("password");
const addMemberLink = document.getElementById("addMemberLink");
const logOutBtn = document.getElementById("logOutBtn");

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
        localStorage.setItem("username", username)
        localStorage.setItem("password", password);
        location.reload();
    }
    else {
        alert("YOU may not enter.")
    }
})

logOutBtn.addEventListener("click", (e) => {
    e.preventDefault();
    localStorage.clear();
    location.reload();
})