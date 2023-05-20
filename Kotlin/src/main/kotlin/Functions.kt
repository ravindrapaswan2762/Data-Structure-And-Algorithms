fun main(){

    val x: Int = addNumber(4, 5);
    println(x)

    printName("Ravindra")

    DefaultArgumenets("John", "Forst")
    DefaultArgumenets("John")

    // Order is not necessary when parsing with named argument.
    println(Volume("Record Box", 1, Height = 10, Width = 5))
}
fun addNumber(x: Int, y: Int) : Int{
    return x+y;
}
fun printName(name: String){
    println(name)
}
fun DefaultArgumenets(FirstName: String, LastName: String="Doe"){
    println("Name is ${FirstName} ${LastName}")
}
fun Volume(BoxName: String, Length: Int, Width: Int, Height: Int): Int{
    return Length*Width*Height
}
