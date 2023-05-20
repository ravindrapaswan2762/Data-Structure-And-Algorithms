fun main(){
    val rating = 9;
    val result = when (rating){
        5 -> "High"
        3, 4 -> "Good"
        1, 2 -> "Poor"
        else -> {
            println("No Rating")
            "Zeero"
        }
    }
    println("The result is $result")

}