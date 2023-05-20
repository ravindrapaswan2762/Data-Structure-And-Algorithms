// "ANY Classs" is the parent class of all the classes in kotlin.

open class Vehicle(){
    open fun StartEngine(){

    }
}

class BMWcar(): Vehicle(){
    override fun StartEngine(){
        println("BMWcar: starting the engine.")
        super.StartEngine()
    }
}

class AUDIcar(): Vehicle(){
    override fun StartEngine(){
        println("AUDIcar: starting the engine.")
        super.StartEngine()
    }
}
//------------------- fun--------------
fun startCAR(car: Vehicle){
    car.StartEngine();
}
//------------------- fun--------------

fun main(){
    val bmw: Vehicle = BMWcar();
    startCAR(BMWcar())

    val audi: Vehicle = AUDIcar();
    startCAR(AUDIcar())
}