package generic

//why in only?
//declaration-site variance
open class Fruit
class Apple: Fruit()

//declaration-site variance
class Box<in T>{
    fun put(item: T){}
//    fun get(): T { TODO("return item of type T")} // b/c cant't return output as "T" type.

}

fun main(){
//  we can add parent class in child class.
    val fruitBox = Box<Fruit>()
    val appleBox: Box<Apple> = fruitBox

//    val apple: Apple = appleBox.get() //returns a fruit while an apple is required
}