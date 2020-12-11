document.addEventListener("DOMContentLoaded", (event) => {
    var list = document.getElementById("list");
    var addButton = document.getElementById("addBtn");

    addButton.addEventListener("click", (event) => {
        if (list.children.length > 10) {
          alert("Dodano maksymalną liczbę elementów!");
          return;
        }

        var itemName = document.getElementById("nameInput").value;

        if (itemName == "") {
          itemName = "Element bez nazwy - ";
        } else {
          itemName += " - "
        }
        
        var newLi = document.createElement("li");
        newLi.innerHTML = itemName;
            
        var newSpan = document.createElement("span");
        newSpan.innerHTML = "Usuń";

        newSpan.setAttribute("class", "my-button");
            
        newSpan.addEventListener("click", function(event) {
          this.parentElement.parentElement.removeChild(this.parentElement);
        });
        
        newLi.appendChild(newSpan);
        list.appendChild(newLi);
    });
  });