fun main(){
    val names = arrayOf("jack", "john", "frank")
    for (name in names){
        print(name+" ")
    }
    println()

    for (i in names.indices){
        print(names[i]+" ")
    }
}