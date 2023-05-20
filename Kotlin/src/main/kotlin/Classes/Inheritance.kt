open class Person(val name: String){
    init{
        println("This is a person.")
    }
    open var age: Int = 24;
    open fun doWork(){
        println("Person is doing work.")
    }
}
class Student120(name: String, val school: String, override var age: Int): Person(name){
    init {
        println("This is a student.")
    }
    override fun doWork(){
        println("Student is studying.")
        super.doWork() // use "super" when any properties calling from parent to in child class.
    }
}
fun main(){
    val student = Student120 ("John", "DP School", 10);
    student.doWork();
    println("The age of student is ${student.age}");

//    val x: Person = Student120("Mark", "Doe")// but here is, student is parent class.
}