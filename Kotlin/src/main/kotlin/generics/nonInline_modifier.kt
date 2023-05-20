// inline lambda/anonymous parameters can't be stored in a variable, passed to another function
inline fun printName(name: String, fn: (String) -> Unit, noinline fn1: (Int, Int) -> Unit){
    fn(name)
    printSum(fn1)
}

fun printSum(fn: (Int, Int) -> Unit){
    fn(4, 7)
}

fun main(){
    val name: String = "John"
    printName(name, {println(it)}) {x: Int, y: Int -> println("The sum of number is ${x + y}")}

    //println(name)
}