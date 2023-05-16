function calculate() {
    //var inputValue = prompt("Plese enter number for factorial: ");
    var inputValue = document.getElementById('factorialTxtId').value;
    var checkValue = isNaN(inputValue);
    
    if (!checkValue) {
        document.getElementById('inputValueID').innerHTML = inputValue;
        var final = 1;
        
        while(inputValue >= 1) {
            final = final * inputValue;
            inputValue--;
        }
        
        document.getElementById('checkValue').innerHTML = final;
    }
    }