class Student1(FirstName: String = "Mark"){
    val FirstName: String
    var LastName: String? = null

    init {
        println("Init Block Is Called.")
        this.FirstName = FirstName
    }
    constructor(FirstName: String, LastName: String): this(FirstName){
        println("Secondary Constructor Is Called.")
        this.LastName = LastName
    }
}

fun main(){
//    val student: Student1 = Student1("John");
    val student: Student1 = Student1("John", "Doe");
    println("Name of the student ${student.FirstName} ${student.LastName}")
}