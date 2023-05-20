// used "inline" for "return" in lambda function.
inline fun printSum(fn: (Int?, Int)->Unit ){
    val x = null;
    val y = 7;
    fn(x, y);
    println("Done with printSum() function.")
}

fun main(){
    printSum({x: Int?, y: Int ->
        if (x==null){
            return@printSum; // return and execute rest code bellow.
        }else{
            println("Sum of $x and $y is ${x+y}")
        }
    })
    println("Done")
}