// abstract  class is by defaul open, so we do not neet to write open.
abstract class Person123(Name: String){

    abstract fun doWork() // abstract fun have no body.
    fun doTalk() {

    }
}

class Student123(Name: String, val School: String): Person123(Name){
    override fun doWork(){
        println("student is studying.")
    }

}

fun main(){
    val student = Student123("John", "DP School");
    student.doWork()


}