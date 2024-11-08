package functions

val action = { println("Hello, World") }
val calc: (Int, Int) -> Int = {x,y -> x*y}

fun main(args: Array<String>) {
    doSomething(action)
}

fun doSomething(func: () -> Unit){
    func()
}