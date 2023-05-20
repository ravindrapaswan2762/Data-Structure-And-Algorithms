fun main(){
//   COLLECTION : it is group of objects and it's work as a single unit to give as easy access to these objects
//                which we call elements.

//   There are three type of collection in kotlin.
//   1.  LIST : list is similar to array which is index based.
//   1.  SET
//   1.  MAP

    println("------------------------ LIST ------------------------------")
    println("            --------immutable list-------")
    val list = listOf("John", "Mark", "Sara", "Finn")
    println("1. The size of the list is ${list.size}")
    println("3. The second item of the list is ${list.get(1)}")
    println("4. The second item of the list is ${list.get(1)}")
    println("5. The second item of the list using index operator is ${list[1]}")
    println("6. Finn is at the index ${list.indexOf("Finn")} in the list")
//    list.add("Ravindra") - Error

    println("            -------mutable list--------")
    val list2 = mutableListOf("John", "Mark", "Finn")
    list2.add("Ravindra")
    list2.removeAt(1)
    list2.remove("Finn")
    println(list2)
    list2.set(0, "IonMan")
    list2[1] = "Captan America"
    println(list2)
    list2.clear();
    println(list2)


}