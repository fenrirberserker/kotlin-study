package concepts

fun main() {
    repeat(times = 3){
        println("Hello World!")
    }

    for (x in 1..5) {
        println("Number $x")
    }

    for (letter in 'A'..'Z') {
        println("Letter $letter")
    }
}