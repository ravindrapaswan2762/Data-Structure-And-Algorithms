fun main(){
    var name:String? = null

    // safe call operator ?.
    println(name?.length)

    // Elvis operator ?:
    println(name?.length ?: 0)

}



