package concepts

fun main(args: Array<String>) {

    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 plus h2//infix functions are like operators
    println(h3.name)

    val h4 = h1 + h2
    println(h4.name)

}

class Header(var name: String){

}

//overloading operators
operator infix fun Header.plus(other: Header):Header{
    return Header(this.name + other.name)
}

