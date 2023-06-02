package functions

import concepts.Person

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5,6,7,8,9)
    val smallints = ints.filter { it < 4 }

    for (i: Int in smallints){
        println(i)
    }

    println()

    val squared = ints.map { it * it }

    for (i: Int in squared){
        println(i)
    }

    println()

    val smallsquared = ints.filter { it < 5 }
        .map { it * it }

    for (i: Int in smallsquared){
        println(i)
    }

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Comittee Meeting"))


    var titles: List<String> = meetings
        .filter { it -> it.name.startsWith("C") }
        .map { m -> m.name }
    for (t in titles){
        println(t)
    }

    println()
    val greaterThanThree = {v:Int -> v>3}

    var largeInts = ints.all { it > 3 }
    println(largeInts)

    largeInts = ints.any (greaterThanThree)
    println(largeInts)

    var numLargeInts = ints.count (greaterThanThree)
    println(numLargeInts)

    var found = ints.find (greaterThanThree)
    println(found)


    var othermeetings = meetings
        .asSequence()//like streams
        .filter { println("filter($it)"); it.name.startsWith("C") }
        .map { println("map($it)"); it.name }

    for (i in othermeetings){
        println(i)
    }
}