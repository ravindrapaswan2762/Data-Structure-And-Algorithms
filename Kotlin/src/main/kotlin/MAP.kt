fun main(){
//   MAP : map is the collection of pair of key and values

    println("                      ---------- Immutable Map ------------")
    val map = mapOf(1 to "John", 2 to "Mark", 3 to "Finn", 4 to "Sara")
    println("1. students ${map.values}")
    println("2. Ranks ${map.keys}")
    println("3. Finn has got a rank ${map.containsValue("Finn")}")
    println("4. There is a 4th rank ${map.containsKey(4)}")
    println("5. The student at the first rank is: ${map.get(1)}")
//  map.put(5 to "Ravindra") - Error


    println("                      ---------- mutable Map --------------")
    val map2 = mutableMapOf(1 to "John", 2 to "Mark", 3 to "Finn", 4 to "Sara")
    map2.put(1, "Ravindra")
    map2.remove(2)
    println(map2)
}