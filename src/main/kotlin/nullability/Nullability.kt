package nullability

fun main(args: Array<String>) {
    val m: Meeting? = null//allow null
    var newMeeting = Meeting()
    val s: String? = null
    val value = s?:"isDefault"//elvis operator
    println(value)

    newMeeting = m ?: Meeting()//cannot assign due to nullability, use elvis op

//    closeMeeting(m)//nullable type
    closeMeeting(newMeeting)

    m?.let { //call only when non null
        closeMeetingNonNull(m)
    }
}

fun closeMeetingNonNull(m: Meeting): Boolean?{
    return if(m.canClose) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean? {
    return if (m!!.canClose) m.close()//null assertion
    else false
}

class Meeting{
    val canClose: Boolean = false
    lateinit var address: Address//late init, not null, not initialized
    fun close(): Boolean{
        return true
    }

    fun save(o: Any){
        val saveable = o as? ISaveable
        saveable?.save()//safe call
    }

    fun init(addr: Address){//initialized here
        address = addr

    }


}

interface ISaveable{
    fun save()
}

class Address{

}