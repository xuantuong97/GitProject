function cal(caculator){
    let number1 = +document.getElementById("num1").value;
    let number2 = +document.getElementById("num2").value;
    let result = 0;
    if (caculator === 1){
        result = number1 + number2;
    }
    else if (caculator === 2){
        result = number1 + number2
    }
    else if (caculator === 3){
        result = number1*number2
    }
    else {
        result = number1/number2
    }
    document.getElementById("result").innerHTML = ("Kết quả: "+ result);
}