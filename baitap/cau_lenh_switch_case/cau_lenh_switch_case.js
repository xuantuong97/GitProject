function tinhngay(){
    let thang = +document.getElementById("date").value;
    let ngay;
    switch (thang){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: ngay = " có 31 ngày"; break;
        case 4:
        case 6:
        case 9:
        case 11: ngay = " có 30 ngày"; break;
        case 2: ngay = " có 28 hoặc 29 ngày"; break;
        default: ngay = " không hợp lệ";
    }
    document.getElementById("result").innerText = ("Tháng "+ thang + ngay)
}