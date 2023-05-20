class student1232(val name: String){

    class choolBag(){
        fun printBagOwner(){
//            println("This school bag belongs to ${name}") // we 'cant' acces the data member of outer class.
        }
    }
}

//------------------------ Iner Class -------------------
class student1233(val name: String){

    inner class choolBag2(){
        fun printBagOwner2(){
            println("This school bag belongs to ${name}") // we 'can' acces the data member of outer class.
        }
    }
}
//------------------------ Iner Class -------------------

fun main(){
    student1232.choolBag().printBagOwner() // for nested class
    student1233("Mark").choolBag2().printBagOwner2() // for Inner class
}