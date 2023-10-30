const usernameInput = document.getElementById("username");
const passwordInput = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");

loginBtn.addEventListener("click", (e) => {
    console.log("click");
    e.preventDefault();

    let username = usernameInput.value;
    let password = passwordInput.value;
    localStorage.setItem("username", username)
    localStorage.setItem("password", password);

    if (username == "admin" && password == "admin") {
        alert("Welcome back Overlord.");
        console.log("successful log in.")
        location.reload();
    }
})