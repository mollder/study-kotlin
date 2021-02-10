package org.ingue.study.example4

data class Person(val name: String, val age: Int)

val sum = { x: Int, y: Int -> x + y}
val getAge = Person::age

fun salute() = println("salute!")

fun sendEmail() = { person: Person, email: String -> println("${person.name} send to $email")}
fun Person.isAdult() = age >= 21
val predicate = Person::isAdult

val nextAction = ::sendEmail
val createPerson = ::Person

val p = Person("p", 23)
val dmitrysAgeFunction = p::age // 실제 인스턴스 객체를 참조할 수 있음

fun main() {
    val people = arrayListOf(createPerson("Alice", 29), Person("Bob", 31))

    println(people.maxByOrNull { p: Person ->  p.age })
    println(people.maxByOrNull { p -> p.age }) // 유추하기 쉽다면
    println(people.maxByOrNull { it.age }) // 람다의 파라미터가 하나뿐이라면
    println(sum(1, 2))

    println(getAge(Person("ingue", 28)))
    println(createPerson("ingue", 28).isAdult())

    println(dmitrysAgeFunction())

    run(::salute)

    people.forEach {
        println(it.name) // 하나라면 자동 유추.. good
    }
}
