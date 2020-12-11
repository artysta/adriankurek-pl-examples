document.addEventListener("DOMContentLoaded", (event) => {
  var hasEvent = false;
  
  var myEvent = function(event) {
    document.getElementById("txt-area").value += "To działa! Naciśnięto przycisk!\n";
  }

  var btnAdd = document.getElementById("add-remove-event-button");
  btnAdd.addEventListener("click", function(event) {
    var txtArea = document.getElementById("txt-area");

    if (hasEvent) {
      hasEvent = false;
      document.getElementById("check-event-button").removeEventListener("click", myEvent);
      txtArea.value += 'Usunięto event z przycisku "Sprawdź"!\n';
    } else {
      hasEvent = true;
      document.getElementById("check-event-button").addEventListener("click", myEvent);
      txtArea.value += 'Dodano event do przycisku "Sprawdź"!\n';
    }
  });
});