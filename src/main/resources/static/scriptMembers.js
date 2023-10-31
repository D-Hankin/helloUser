const username = localStorage.getItem("username");
const skullIcon =  document.getElementById("skullIcon");
const noEntry = document.getElementById("noEntry");
const table = document.getElementById("table");
let noOfRows = table.tBodies[0].rows.length;

    if (username == "admin") {
        noEntry.src="";
    }
    else {
        skullIcon.src="";
    }

    console.log(skullIcon.src + noEntry.src);
    console.log(noOfRows);
