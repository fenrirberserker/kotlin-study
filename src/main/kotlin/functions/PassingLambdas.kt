package functions

import functions.java.Created
import functions.java.User

fun main(args: Array<String>) {
    var user = User("Kevin")
    var count =0
    //pass lambdas to java methods
    user.create { println("User $it has been created: ${++count} times") }
    var eventListener = Created({ println("User $it has been created: ${++count} times") })//SAM constructor to disambiguate method
    user.create(eventListener)
}