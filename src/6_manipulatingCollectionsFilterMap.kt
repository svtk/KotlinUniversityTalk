package manipulatingCollections

data class Person(val name: String, val age: Int)

fun q1(people: List<Person>) {
    val adults = arrayListOf<Person>()
    for (person in people) {
        if (person.age >= 21) {
            adults.add(person)
        }
    }
    println(adults)
}

fun q2(people: List<Person>) {
    val adults = arrayListOf<String>()
    for (person in people) {
        if (person.age >= 21) {
            adults.add(person.name)
        }
    }
    println(adults)
}

fun a12(people: List<Person>) {
    println(people.filter { it.age >= 21 })
    println(people.filter { it.age >= 21 }.map { it.name })
    println(people.filter { it.age >= 21 }.map(Person::name))
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age >= 21 }.map(Person::name))
}