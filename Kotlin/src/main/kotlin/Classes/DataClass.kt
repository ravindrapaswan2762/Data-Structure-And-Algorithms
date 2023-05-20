data class Student101(val name: String, val section: String){
    var age: Int = 8;
}
fun main(){
    val student = Student101("John", "A");
    student.age = 10;
    val student1 = Student101("John", "A");

    // equals
    println("Line 1: equal() function: ${student1.equals(student)}")

    // toString
    println("Line 2 toString() function: ${student1.toString()}")

    // copy
    val student2 = student.copy("Mark")
    println("Line 3 toString() function: ${student2.toString()}")

    // distructing
    val (name, section) = student;
    println("Line 4 distructing: $name in is section $section")


}