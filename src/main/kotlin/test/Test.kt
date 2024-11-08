package test

class Test {


    fun printHello() {
        println("Hello World")
    }


    companion object {
        fun printHello() {
            println("Hello World from companion object")
        }
    }


}

fun printHelloKotlin() {
    println("Hello World from kotlin")
}

fun main(){
    val test = Test()
    test.printHello()

    Test.printHello()

    printHelloKotlin()
}