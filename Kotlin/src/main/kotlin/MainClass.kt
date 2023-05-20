fun main(){
    val x = 5;
    println("Hello World $x");
    println("Hello World "+x); // both same outputs

    val s1 = "ravindra"
    val s2 = "paswan"
    println(s1.plus(" ").plus(s2).plus(4565))

    //------------------------------------------ variables

    var a: Int = 5; // it can be change further, b/c it is a mutable variable.
    val b: Int = 10; // val is immutable, it can't change further

    a = 50;
//  b = 100; // it can't changeble, b/c it a immutable variable
    println(a)
    println(b);

    var name: String = "ravindra";
    println("Hi i am $name")

    //---------------------------------------------- null pointer exception
    var myName: String? = null
    myName?.let {
        println(myName)
    }
    //---------------------------------------------list
    val  list = listOf<Int>(1, 2, 3, 4, 5, 6)
    list.filter({
        it % 2==0
    }).map({
        it*it
    }).forEach({
        print("$it ")
    })
    println()
    //---------------------------------------------- if else

    var z = 2;
    if (z in 0..5){
        //println(z)
    }
    if (z !in 0..5){
        //println(z)
    }

    val age = 24;
    if (age<24){
        println("you can't vote")
    }
    else{
        println("you can vote")
    }
           // OR
    val value: Int = if (true){
        println("inside true")
        10
    }else{
      20
    }
    println(value)
    //------------------------------------------------- when == switch case
    var name1: String = "Ravindra"
    when(name1){
        "Ravindra"->{
            println("Awesome")
        }
        "Paswan"->{
            println("Wow")
        }
        else->{
            println("nothing else")
        }
    }
    //----------------------------------------------- Arrays
    val array = arrayOf("ram", "mohan", "syam", 5, 5.0545)


    for (item in array ){
        //print("$item ")
    }
          // 0R
    for (i in 0..array.size-1){
        //print(array[i])
        //print(" ")
    }

    for (i in 0..array.size-1 step 2){
        print(array[i])
        print(" ")
    }
    for (i in 5 downTo 0){
        //println(i)       4 3 2 1 0
    }
    println()
    //--------------functin calling

    var m = operation(2, 7)
    println(m)

    Greetings("ravindra", "Good Evening!")

    val value1 = operation4(2, 3, {a,b->a+b})
    println(value1)
    //---------------------opps
    val p1 = person("ravindra")
    println(p1.name)


}

//------------------------------------------------------- functions
fun operation(a: Int, b: Int) : Int {
    return a+b;
}
        //0R
fun operation2(a: Int, b: Int) : Int = a+b  // one liner

fun Greetings(greet:String, str: String = " default value"){
//    println("Hello $greet $str")
}

fun operation4(a: Int, b: Int, operate:(Int, Int)->Int ) : Int{
    return operate(a, b);
}

//--------------------------------------------------------- opps
class person(val name : String);
