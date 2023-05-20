package generics

//why return only?
open class Fruit
class Apple: Fruit()
class Orange: Fruit()
class mango: Fruit()

//declaration-site variance
class Box<out T>{
    fun get(): T { TODO("Return item of type T") }
//    fun put(item: T) {} // gives error. b/c we cant take input as type of "T".
}

fun main(){
    //  we can add child class in parent calss.
    val appleBox = Box<Apple>()
    val fruitBox: Box<Fruit> = appleBox
//  fruitBox.put(Orange()) //we are able to put an orange in a box of apple
}

