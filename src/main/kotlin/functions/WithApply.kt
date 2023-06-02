package functions

import java.util.*

data class Meeting(var id: Int, var name: String) {


    var Title: String =""
    var When: Date= Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting(1, "Board Meeting")
//    m.Title = "Board Meeting"
//    m.When = Date(2017, 1, 1)
//    m.Who.add("Kevin")

    with(m){
        Title = "Board Meeting"
        When = Date(2017, 1, 1)
        Who.add("Kevin")
    }

    m.apply {
        Title = "Board Meeting"
        When = Date(2017, 1, 1)
        Who.add("Kevin")
    }.create()
}