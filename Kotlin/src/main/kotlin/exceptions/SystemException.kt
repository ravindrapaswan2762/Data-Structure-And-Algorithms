fun parseMovieName(name: String): Int{
    return name.toInt()
}

fun main() {
    val name: String = "300"
//    val name: String = "Titanic" // give error
    val x = parseMovieName(name)
    println(x)
}