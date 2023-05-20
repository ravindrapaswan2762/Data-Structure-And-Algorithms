
//crossinline can be declared only for parameters of inline function
inline fun printString(crossinline fn: (String) -> Unit): Unit{
    fn("John")
    println("Data printed")

}

fun main(){
    printString{println(it)}
}