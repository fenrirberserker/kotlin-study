package ArraysCollections

/**
 * Reify allows the use of types at runtime
 */

fun main(args: Array<String>) {
    val meetings = listOf(BoardMeeting(),FinanceMeeting())

    val board = meetings.typeOf<BoardMeeting>()

    println(board.count())
}

inline fun <reified T> List<*>.typeOf(): List<T> {
    val returnList = mutableListOf<T>()

    for (item in this){
        if (item is T){//requires reified type and inline
            returnList.add(item)
        }
    }
    return returnList
}

fun <T: Meeting> buildMeeting(meetingClass: Class<T>, action: (T) -> Unit ): T{
    val meeting: T = meetingClass.newInstance()
    action(meeting)
    return meeting
}

inline fun <reified T : Meeting> buildMeeting(noinline action: (T) -> Unit): T{
    return buildMeeting(T::class.java, action)
}
open class Meeting {
    fun attend() {
        TODO("Not yet implemented")
    }

}

class BoardMeeting: Meeting(){

}

class FinanceMeeting: Meeting(){

}