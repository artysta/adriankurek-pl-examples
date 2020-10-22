document.addEventListener("DOMContentLoaded", (event) => {
  let inputKey = document.getElementById("input-key");
  let inputValue = document.getElementById("input-value");
  let btnSave = document.getElementById("btn-save");
  let btnRemove = document.getElementById("btn-remove");
  let list = document.getElementById("list");

  reloadData();
  
  btnSave.addEventListener("click", event => {
      let key = inputKey.value;
      let value = inputValue.value;

      if (key.trim() != "" && value.trim() != "") {
          localStorage.setItem(key, value);
          reloadData();
      } else {
          alert("Key and value inputs can not be empty!");
      }
  });

  btnRemove.addEventListener("click", event => {
      let key = inputKey.value;

      if (key.trim() == "") {
          alert("Key input can not be empty!");        
          return;
      }

      if (localStorage.getItem(key) == null) {
          alert('There is no "' + key + '" key in the local storage!');
          return;
      }

      alert('Key "' + key + '" (value = ' + localStorage.getItem(key) + ') has been removed from the local storage!');
      localStorage.removeItem(key);
      reloadData();
  });

  function reloadData() {
      clearList();
      for (let i = 0; i < localStorage.length; i++) {
          let key = localStorage.key(i);
          let value = localStorage.getItem(key);
          let liElement = document.createElement("li");

          liElement.innerHTML = i + ") key = " + key + ", value = " + value;
          list.appendChild(liElement);
       }
  }
  
  function clearList() {
      while (list.firstChild)
          list.removeChild(list.firstChild);
  }
});