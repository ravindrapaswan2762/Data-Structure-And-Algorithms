import java.util.*

// Anonymous class : parent class ke fun's ko override karke apne hisaab se use karna

open class Person100{
    fun walk(){
        println("person is walking.")
    }
    fun sleep(){
        println("person is sleeping.")
    }
    open fun talk(){
        println("person is talking.")
    }
}

fun main(){
    startTalking( object: Person100(){
        override fun talk(){
            println("I am Talking.")
        }
    })
}

fun startTalking(person: Person100){
    person.talk()
}