fun <T:Any> printPrice(price: T){
    println("The price is $price")
}

fun main(){
    printPrice<Int>(23);
    printPrice<Double>(23.45);
    printPrice<String>("Hello World");

    val price: Int? = null;
//    printPrice<Int?>(price) // erroe


}