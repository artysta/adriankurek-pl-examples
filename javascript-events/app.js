document.addEventListener("DOMContentLoaded", function () {
  var btnAdd = document.getElementById("add-button");

  btnAdd.addEventListener("click", function (event) {
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;

    if (a == "" || b == "") {
      alert("Pola nie mogą być puste i zawierać liter!");
      return;
    }

    document.getElementById("result").innerHTML = Number(a) + Number(b);
  });

  var btnClear = document.getElementById("clear-button");

  btnClear.addEventListener("click", function (event) {
    document.getElementById("a").value = "";
    document.getElementById("b").value = "";
    document.getElementById("result").innerHTML = "";
  });
});
