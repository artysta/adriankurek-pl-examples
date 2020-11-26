document.addEventListener("DOMContentLoaded", (event) => {
    let inputName = document.getElementById("input-name");
    let inputValue = document.getElementById("input-value");
    let btnSave = document.getElementById("btn-save");
    let btnRemove = document.getElementById("btn-remove");
    let list = document.getElementById("list");
    let cookiesArray;

    reloadCookies();

    btnSave.addEventListener("click", event => {
        let name = inputName.value;
        let value = inputValue.value;

        if (name.trim() === "") {
            alert("If you want to add or modify a cookie, you must enter its name.!");
            return;
        }

        document.cookie = name + "=" + value + ";expires=" + new Date(Date.now() + 3600_000).toString();

        clearFields();
        reloadCookies();
    });

    btnRemove.addEventListener("click", event => {
        let name = inputName.value;

        if (name.trim() === "") {
            alert("If you want to add or modify a cookie, you must enter its name.!");
            return;
        }

        document.cookie = name + "=;" + "expires=Thu, 01 Jan 1970 00:00:00 UTC";

        clearFields();
        reloadCookies();
    });

    function reloadCookies() {
        clearList();
        let cookiesString = document.cookie;
        cookiesArray = cookiesString.split("; ");

        for (let i = 0; i < cookiesArray.length; i++) {
            let liElement = document.createElement("li");

            liElement.innerHTML = cookiesArray[i];
            list.appendChild(liElement);
        }
    }

    function clearList() {
        while (list.firstChild)
            list.removeChild(list.firstChild);
    }

    function clearFields() {
        inputName.value = "";
        inputValue.value = "";
    }
});