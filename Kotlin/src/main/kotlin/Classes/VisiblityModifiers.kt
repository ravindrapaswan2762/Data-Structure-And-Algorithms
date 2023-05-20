class Student3 private constructor(val name: String = "Mark"){
    constructor(FirstName: String, LastName: String): this("$FirstName $LastName")
}
fun main(){
//    val a = Student3("John")
    val b = Student3("John", "Doe")
}





// visiblity modifier          class level                                  top level(properties who is outside of class)
//   |                              |                                          |
// public                       visible everywhere                           visible everywhere
// internal                     visible in a module                          visible in a module
// protected                    visi. inside class and sub-class             n/a
// private                      visi. inside class                           visible inside the file