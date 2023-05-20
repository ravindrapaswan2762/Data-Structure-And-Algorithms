fun main(){
    val name: String = "John";

    val f0: (Int, Int) -> Int = {x, y -> x+y}
    println(f0(2, 4))

    val f1 = {2} // minimal lamda expression.
    println(f1())

    val f2 = {x: Int ->
        println(x);
        x*2
    }
    println(f2(2))

    // "it" for single parameter.
    val f3: (String) -> Int = {x: String -> x.length}
    println(f3.invoke("John"))

    performOperation(8, 2, {x, y -> x+y})


}
fun perform0peration(x: Int, y: Int, fn: (Int, Int) -> Int){
    val result = fn(x, y);
    println("The result of $x and $y is $result")
}