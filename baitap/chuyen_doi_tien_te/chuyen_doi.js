

    function shown() {
        let outputValue;
        let fromValue;
        let toValue;
        let inputValue = parseInt(document.getElementById("vlin").value)
        fromValue = document.getElementById("from").value;
        toValue = document.getElementById("to").value;
        if ((fromValue == "VND" && toValue == "VND")||(fromValue == "USD" && toValue == "USD")){
            outputValue = inputValue
        }
        else if(fromValue == "USD" && toValue == "VND"){
            outputValue = inputValue * 23000
        }
        else {
            outputValue = inputValue / 23000
        }

       document.getElementById('cell').innerHTML = ("Result: " + outputValue);
    }
