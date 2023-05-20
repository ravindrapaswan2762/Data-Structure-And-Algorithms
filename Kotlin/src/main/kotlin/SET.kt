fun main(){
//   SET : set is the collection of unique element

    println("           --------- Immutable Set ------------")
    val set = setOf("John", "Mark", "Finn")
    println("1. The size of the set is ${set.size}")
    println("Set contains ${set.contains("Finn")}")
//  set.add("Ravindra") - Error


    println("           --------- mutable Set --------------")
    val set2 = mutableSetOf("John", "Mark", "Finn")
    set2.add("Ravindra")
    set2.add("Ravindra")
    println(set2)
    set2.remove("Finn")
    println(set2)
}