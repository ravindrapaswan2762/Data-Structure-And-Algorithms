// Type alias need to be declared as top level.
// They don't create a new type.
// Not only for function type but for any type.

typealias Intfn = (Int, Int) -> Int
typealias str = String;

fun printSum(x: Int, y: Int, fn: Intfn){
    val sum = fn(x, y);
    println("Sum of $x and $y is $sum");

    val x: str = "John";
}