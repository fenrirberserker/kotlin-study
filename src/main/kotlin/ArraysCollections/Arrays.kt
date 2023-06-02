package ArraysCollections

fun main(args: Array<String>) {
    val items = IntArray(2)
    items[0] = 1
    items[1] = 2

    val numbers = intArrayOf(1,2,3,4)

    numbers.forEachIndexed { index, i ->
        println("$index is: $i")
    }

}