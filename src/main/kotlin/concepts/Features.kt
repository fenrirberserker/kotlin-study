package concepts

import java.lang.NumberFormatException
import java.util.TreeMap

fun main(args: Array<String>) {

    println("hello world")
    //var mutable
    val kevin = Person("Kevin")//final immutable
    println("name is: ${kevin.name}")

    kevin.name = "John"

    println("name is: ${kevin.name}")

    kevin.display()

    kevin.lambda(::printName)

    //if
    var answer = "true"
    val message = if(answer == "true"){
        "correct"
    }else{
        "incorrect"
    }

    println(message)
    //nullable
    //var nullable:String = null// not possible
    var nullable: String? = null//allows nulls
    println(nullable)

    //when
    var ans:String = "one"
    when(ans){
        "one" -> println("correct")
        "two" -> println("incorrect")
        else -> println("wrong")
    }

    //for
    for (i in 1..10){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    var numbers = listOf(1,2,3,4,5,6)
    for (i in numbers){
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["kevin"] = 52;
    ages["John"] = 24;
    ages["Charly"] = 25;
    ages["Bravo"] = 35;

    for ((name,age) in ages){
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()){
        println("$element at $index")
    }

    var range = 'a' .. 'z'
    for (i in range){
        println(i)
    }



    //exceptions
    var number: Int = try{
        Integer.parseInt(ans)
    }catch (e:NumberFormatException){
        -1
    }
    println(number)



}

fun printName(name: String){
    println(name)
}