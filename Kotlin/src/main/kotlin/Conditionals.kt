fun main(){
    var discount = 0;
    val price  = 85;
    if (price>=50){
        discount = 10;
    }else{
        discount = 3;
    }
    println(discount)
// ----------------------------- one linear
    discount = if (price >= 50) 10 else 3
}