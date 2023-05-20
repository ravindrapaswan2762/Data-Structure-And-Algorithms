// Singleton are objects which can have only one instances and singleton are usefull to hold utility
// function/properties which can be use by instances of different classes or the same class.

// Singleton can't have constructor.

object GameScore{
    var score: Int = 0;
    fun addScore(point: Int){
        if (point>0){
            this.score += point;
        }
    }

}

class student1004(val name: String){

    //companion object for direct access with without singleton name.
    companion object{
        const val schoolName: String = "DP School";
    }
}
fun main(){
    GameScore.addScore(10);
    println("The score is ${GameScore.score}") // accessing singleton properties from outer singleton

    println("The school is ${student1004.schoolName}") // accessing singleton properties from class singleton
}