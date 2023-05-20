// It is use for constant value.

enum class Metal(val symbol: String){
    IRON("FE"),
    GOLD("AU"),
    SILVER("AG")
}
fun main(){
    for (metal in Metal.values()){
        println("Symbol ${metal.symbol}, name ${metal.name}, ordinal ${metal.ordinal}")
    }
    printMetal(Metal.IRON)
}

fun printMetal(metal: Metal){
    println(metal.name)
}