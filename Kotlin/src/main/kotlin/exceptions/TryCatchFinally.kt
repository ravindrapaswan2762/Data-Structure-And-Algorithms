import java.lang.Exception

fun parseMovieName1(name: String): Int{
    return name.toInt()
}

fun main(){
    try {
        //getting the movie name from user
        val movieName = "300"
//        val movieName = "Titanic"

        val x = parseMovieName1(movieName)
        println(x)

    } catch(ex: NumberFormatException){
        println("Caught by NumberFormatException: ${ex.message}")
    } catch(ex: Exception){
        println("Caught by Exception: ${ex.message}")
    } finally{
        println("Finally block executed")
    }
}