

let ip = document.getElementById("ip");
function plustext(tx){
    ip.value += tx;
}
function cleartext(){
    ip.value="";
}

function caculator(){
    ip.value = eval(ip.value);
}