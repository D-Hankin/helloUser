const username = localStorage.getItem("username");
const skullIcon =  document.getElementsByClassName("skullIcon");
const noEntry = document.getElementsByClassName("noEntry");
const table = document.getElementById("table");
let noOfRows = table.tBodies[0].rows.length;

    if (username == "admin") {
        for (let i = 0; i < noEntry.length; i++) {
            noEntry[i].src = "";
        }
    }
    else {
        for (let i = 0; i < skullIcon.length; i++) {
            skullIcon[i].src = "";
        }
    }

    console.log(skullIcon);
    console.log(noEntry);
    console.log(noOfRows);
