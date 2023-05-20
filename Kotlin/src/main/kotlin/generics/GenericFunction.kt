fun <T> printContent(content: T){
    println("The content is $content")
}

fun main(){
    printContent<String>("Hello World");
    printContent<Int>(9)
}