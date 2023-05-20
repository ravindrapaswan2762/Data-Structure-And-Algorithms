fun printSum(): ()->Unit{
    var counter = 0;
    return {
        counter++;
        println("The counter is $counter")
    }
}
fun main(){
    val fn = printSum();
    fn();
    fn();
}