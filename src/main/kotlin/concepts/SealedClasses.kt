package concepts
//enums like
sealed class PersonEvent {
    class Awake : PersonEvent()
    class Sleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Sleep -> println("Sleeping")
        is PersonEvent.Eating -> println(event.food)
    }
}