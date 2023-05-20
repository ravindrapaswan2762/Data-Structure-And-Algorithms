open class Person1006(val name: String){}

class Student1006(name: String): Person1006(name)

fun main(){
    //Type
    val age: Int = 23;
    var roolNumber: Int? = 20;

    // subType
    val student: Student1006 = Student1006("John");
    val person: Person1006 = student;

    // Corresponding non Nullable type are subType of nullable type.
    val x: String = "John";
    val y: String? = x;
}