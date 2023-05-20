interface Footballer{
    val Position: String;
    fun Dribble();
    fun Kick(){
        println("Kick the football.")
    }
}

open class Person1231(val Name: String);

class Student1231(Name: String, override val Position: String): Person1231(Name), Footballer{
    override fun Dribble(){
        println("Dribble the ball.")
    }
}

fun main(){
    val student = Student1231("John", "Striker");
    playFootball(student)
}

fun playFootball(footballer: Footballer){
    footballer.Dribble();
    footballer.Kick();
}
fun printName(person: Person1231){
    println("Person name is ${person.Name}")
}