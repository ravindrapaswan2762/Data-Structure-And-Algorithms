fun main(){
    val flateNumber: Int = 25
    val address: String = "Tower 2, Flate No. "+flateNumber
    println(address)

    val flateNumber1: Int = 30
    val address1: String = "Tower 2, Flate No. $flateNumber1"
    println(address1)

    val name: String = "John Doe"
    println("name is ${name.length} character long.")
}