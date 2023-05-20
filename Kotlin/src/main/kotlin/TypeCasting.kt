fun main(){
    // Type Casting
    val name: Any = "John"
    val name1: String = name as String
    println(name1)

    val x: Int = 20;
//    val y: Long = x as Long  // Error
//    println("y = "+y)

    val z: Long? = x as? Long
//    println("z = "+z)


}