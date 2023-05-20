// With help of extension function we can add new feature to a class properties without making any changes
// to it's coat or inherigt it or using any design pattern.
// WE CANT CHANGE BOTH CLASS, USER DEFINED CLASS AND SYSTEM DEFINED CLASS.


class Student1005(val firstName: String, val lastName: String);

// extension function, "Student1005"=user defined class name, "fullName()"=extension function
fun Student1005.fullName() = "${this.firstName} ${this.lastName}";

// extension function, "Int"=system defined class name, "getEven()"=extension function
fun Int.getEven(): Int {
    if (this%2==0){
        return this;
    }
    else{
        return this+1;
    }
}

fun main(){
    val student = Student1005("John", "Doe");
    println("The full name of the student is: ${student.fullName()}");

    val x: Int = 23;
    println("The even age is ${x.getEven()}")
}