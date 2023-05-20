fun main(){
    // ----------------------------- regular function declaring.
    val f0: () -> Unit; // minimal signature.

    val f1: (Int, Int) -> Int;
    val f2: (Int, Int) -> Boolean;

    val f3: ((String) -> Int)? // nullable function.

//  -------------------------------- assigning declared function.
    f1 = ::addInt; // using regular function.
    f2 = {x: Int, y: Int -> x>y} // using lamda function.
    f3 = fun(s: String): Int{return s.length} // using anonymous function.

//  -------------------------------- Calling/Invoking the assigned function.
    f1.invoke(2, 4);
    f2(5, 6);
    f3("Mark");
}

fun addInt(x: Int, y: Int): Int{
    return x+y;
}