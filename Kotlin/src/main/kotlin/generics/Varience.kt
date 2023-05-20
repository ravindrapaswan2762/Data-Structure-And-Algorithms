open class Person2(val name: String){}

class Student2(name: String): Person2(name){}

fun main(){
    val name: List<String> = listOf("John", "Sarah", "Mark");
    val rank: List<Int> = listOf(1, 2, 3);

    val student: Student2 = Student2("John");
    val person: Person2 = student

    val students: MutableList<Student2> = mutableListOf(Student2("John"), Student2("Sarah"))
//    val persons: MutableList<Person2> = student // it gives error, b/c complex subtyping.

}