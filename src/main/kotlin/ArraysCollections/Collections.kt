package ArraysCollections

fun main(args: Array<String>) {

    var people: MutableList<Person?>? = null//allow nullable
    people = mutableListOf(Person(23), Person(24))//mutable, later add
    people.add(null)//add null allowed

    for (person: Person? in people){
        println(person?.age)
    }

    println()

    for (person: Person in people.filterNotNull()){
        println(person?.age)
    }
}

class Person(val age:Int){

}