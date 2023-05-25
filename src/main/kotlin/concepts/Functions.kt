@file:JvmName("KotlinFunctions")//alias for generated classfile

package concepts

fun main() {
    display("Hello world")
    max(5,3)
    log("Logging message")
    log(loglevel = 2, message = "Hello world")//invoke with named params
}

fun display(message: String) : Boolean{
    println(message)
    return true
}

fun max(a: Int, b:Int): Int = if(a>b) a else b

@JvmOverloads
fun log(message: String, loglevel: Int = 1){//default
    println("$message $loglevel")
}