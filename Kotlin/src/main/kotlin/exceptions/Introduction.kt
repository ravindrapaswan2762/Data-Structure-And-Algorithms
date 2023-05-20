fun a(){
    println("fun a() is called.");
    b();
    println("fun a() is finished.");
}
fun b(){
    println("fun b() is called.");
    c();
    println("fun b() is finished.")
}
fun c(){
    println("fun c() is called.")
}

fun main(){
    a();
}