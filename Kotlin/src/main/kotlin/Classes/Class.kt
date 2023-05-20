class Student {
    val school: String = "DP School."
    var age: Int = 5;

    val isTeenager: Boolean
        get() = age>12

    var name: String? = null
        get() = field ?: "Unknown"
        set(value){
            if(value != null){ field = value; }
        }
}
fun main(){

    val student: Student = Student();

    println("1. Student is a teenager ${student.isTeenager}");
    student.age = 14;
    println("2. Student is a teenager ${student.isTeenager}");
    println("3. Student name is ${student.name}");
    student.name = "John";
    println("4. Student name is ${student.name}");


}