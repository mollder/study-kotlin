package org.ingue.study.example

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"), Person("철수", age = 29))

    val oldest = persons.maxByOrNull { it.age?: 0 } // age가 null이면 0으로 쳐라
    println("나이가 가장 많은 사람: $oldest")
}
