package org.ingue.study.example4

data class Person(val name: String, val age: Int)

val sum = { x: Int, y: Int -> x + y}

fun main() {
    val people = arrayListOf(Person("Alice", 29), Person("Bob", 31))

    println(people.maxByOrNull { p: Person ->  p.age })
    println(people.maxByOrNull { p -> p.age }) // 유추하기 쉽다면
    println(people.maxByOrNull { it.age }) // 람다의 파라미터가 하나뿐이라면
    println(sum(1, 2))

    people.forEach {
        println(it.name) // 하나라면 자동 유추.. good
    }
}
