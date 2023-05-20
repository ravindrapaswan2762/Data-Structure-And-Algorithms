open class Personx(val name:String){}
class Studentx(name:String?):Personx(name?: "ABC"){}
class Generator<in T:Personx>{
    fun create(name: String): T{
        return T(name)
    }
}
fun main() {
    val generator = Generator<Studentx>
    val student:Student = generator.create("John")
    print("$student.name")
}