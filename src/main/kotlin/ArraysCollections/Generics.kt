package ArraysCollections

fun main(args: Array<String>) {
    var names: List<String> = listOf("Kevin", "Alex")
    val name = names.itemAt(0)

    println(name)

    val n: Node<Int> = Node(2)
    println(n.value())
}

fun <T> List<T>.itemAt(i: Int) : T{
    return this[i]
}

class Node<T>(private val item: T){
    fun value():T{
        return item
    }
}