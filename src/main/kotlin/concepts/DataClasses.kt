fun main(args: Array<String>) {
    var kevin = Student(1,"Kevin")
    var jones = Student(1, "Kevin")

    println(kevin)

    if (kevin==jones){
        println("equal")
    }else{
        println("not equal")
    }

    var robert = kevin.copy(name = "Rob")
    println(robert)
}
data class Student(val id:Int, val name: String){

}