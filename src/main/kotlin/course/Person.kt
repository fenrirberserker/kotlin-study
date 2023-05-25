package course

class Person(var name: String) {

    fun display(){
        println("Display: $name")
    }

    fun lambda(func: (s:String)->Unit){
        func(name)//object's name
    }
}