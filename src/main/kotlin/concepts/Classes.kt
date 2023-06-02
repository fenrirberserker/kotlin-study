package concepts

fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Jones",1)
    val kevin2 = Student("Kevin", "Jones2",2, "Some tutor")
    println(kevin.id)

    Student.createPostgraduate("Simon")//static like
    Student.createUndergraduate("Kevin")
}

class Program{
    //object defines a standard class. Can implement, can extend. Creates singletons
    companion object{
        @JvmStatic//to be run
        fun main(args: Array<String>) {
            val kevin = Student("Kevin", "Jones",1)
            println(kevin.id)
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {


    open fun getName():String = "$firstName $lastName"

    fun display(){
        println("Display: ${getName()}")
    }

    fun lambda(func: (s:String)->Unit){
        func(firstName)//object's name
    }

    abstract fun getAddress():String
}


open class Student(firstName:String, lastName: String, _id: Int, var tutor :String="") : Person(firstName, lastName){

    val id : Int


    init {
        id = _id
    }

    fun enroll(courseName: String){
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }
    override fun getName() : String{
        return ""
    }

    override fun getAddress(): String {
        return ""
    }

    companion object: XmlSerializer<Student>{


        fun createUndergraduate(name: String): Undergraduate{
            return Undergraduate(name)
        }
        fun createPostgraduate(name: String): Postgraduate{
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
    }

}

class Undergraduate(firstName: String): Student(firstName,"",1){

}

class Postgraduate(firstName: String): Student(firstName,"",1){

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}