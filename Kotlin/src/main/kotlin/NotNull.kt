fun main(){


    printNameLength("Ravindra", "Paswan");
}

fun printNameLength(FirstName:String?, LastName:String?){
    // only if both name are not null then print.
    if (FirstName != null){
        // Not null Assertion Operator !!.
        println("Name ${FirstName.length} ${LastName!!.length}")
    }
}