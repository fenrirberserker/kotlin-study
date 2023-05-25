package concepts

fun main(args: Array<String>) {
    val text = "With             multiple \t       whitespaces"
    //println(replaceMultipleSpaces(text) )
    println(text.replaceMultipleSpaces())
}

/*fun replaceMultipleSpaces(value: String): String{
    var regex = Regex("\\s+");
    return regex.replace(value, " ")
}*/

fun String.replaceMultipleSpaces(): String{
    var regex = Regex("\\s+");
    return regex.replace(this, " ")
}