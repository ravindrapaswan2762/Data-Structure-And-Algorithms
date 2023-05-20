fun perfor0peration(x: Int, y: Int, fn: (Int, Int)->Int){
    val result = fn(x, y);
    println("The result of $x and $y is $result");
}

fun main(){
    val f0: (Int, Int) -> Int = fun (x: Int, y: Int): Int = x+y;
    performOperation(4, 8, f0);

    performOperation(7, 2, fun (x, y) = x-y)
}