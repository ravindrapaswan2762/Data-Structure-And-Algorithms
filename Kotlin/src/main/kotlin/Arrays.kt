fun main(){
    val numbers = arrayOf(1, 2, 3, 4)
    println("The number at second position: ${numbers.get(1)}")
    println("The number at third position: ${numbers[2]}")

    numbers.set(3, 5)
    numbers[1] = 22
    println(numbers.joinToString())

    val arrays = Array(4){0}
    println(arrays.joinToString())

//  ----------------------------------------------------
    val arr2 = arrayOf(1, 2, 3, 4, 5)
    val arr3 = intArrayOf(1, 2, 3, 4, 5)
    val arr5 = IntArray(5, { index -> index + 1 })
//  ----------------------------------------------------


}