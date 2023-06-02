package functions

fun main(args: Array<String>) {
    var program = Program()
    //program.fibonacci(8)
//    program.fibonacci(8, object : Process{
//
//        override fun execute(value: Int) {
//            print("$value ")
//        }
//
//    })
    program.fibonacci(8, {n -> print("$n ") })//also works with func ref

    var total =0
    program.fibonacci(8,{it -> total+=it})
    println()
    println(total)
}

interface Process {
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev =0
        var prevprev =0
        var current =1

        for (i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int){
        var prev =0
        var prevprev =0
        var current =1

        for (i: Int in 1..limit){
            print("$current ")

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}