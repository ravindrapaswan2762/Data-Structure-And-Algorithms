// Used for reified type, lambda return and to prevent runtime overhead
// inline to avoid overhead due to creation of an object
// if lambda is a closure then a new instance is created else singleton
// caveat: don't inline bigger functions. minimize the code to lambda usage
// inline functions can't access non public members of a class
fun performOperation(name: String, fn: (String) -> Unit){
    fn(name)
}

fun main(){
    val name: String = "John"
    performOperation(name) {println(it)}

    println(name)
}