
fun main(){
    val f0: (Int)-> Unit

    val printSum: Int.(Int) -> Unit = {println("The sum of $this and $it is ${this.plus(it)}")}
    val x: Int = 6
    x.printSum(4)

    val printSum1: Int.(Int) -> Unit = fun Int.(num: Int) : Unit = println("The sum of $this " +
            "and $num is ${plus(num)}")
    val y: Int = 6
    y.printSum(4)
}