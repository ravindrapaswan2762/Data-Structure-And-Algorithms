fun printItem(item: MutableList<*>){
    for (i in item.indices){
        println(item.get(i));
    }
}

fun main(){
    val x: MutableList<Any> = mutableListOf(1, 2, "a");
    printItem(x);
}