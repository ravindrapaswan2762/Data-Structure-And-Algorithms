fun getSum(x: Int, y: Int): Int{
    return x+y;
}

// Higher order function or parsing a function
fun performOperation(x: Int, y: Int, fn: (Int, Int) -> Int){
    val result = fn(x, y);
    println("Result of $x and $y is $result");
}

// returning a function.
fun getLength(): (String) -> Int{
    return {x: String -> x.length}
}

fun main(){
    // pass function as parameter.
    performOperation(2, 4, ::getSum);
    performOperation(2, 4, {x, y -> x-y});
    performOperation(2, 4, fun (x:Int, y:Int): Int = x*y);

    // returning a function.
    val f: (String) -> Int = getLength()
    println("Length is ${f("Mark")}")


}