fun main(){
//   start point and end point also included int the range
//   Method One
    println("Method One")
    for (i in 1..5){
        print("$i ")
    }
    println()
    println("Method Two") //  Method Two
    if (4 !in 5..10){
        println("Not There")
    }
    println("Method Three") // this is excluded
    for (i in 1 until 5){
        print("$i ")
    }
    println()
    println("Method Four") // skiping by one
    for (i in 1..5 step 2){
        print("$i ")
    }
    println()
    println("Method Five") // reverse print
    for (i in 5 downTo 1){
        print("$i, ")
    }
}