package org.ingue.study.example4

data class Person2(val name: String, val age: Int)

val list = arrayListOf(1, 2, 3, 4)
val people2 = arrayListOf(Person2("Alice", 29), Person2("Alic", 31))
val people3 = arrayListOf(Person2("a", 1), Person2("b", 1), Person2("c", 2))

val isLow30 = { p: Person2 -> p.age <= 30 }

val stringGroupList = listOf("a", "ab", "b")

fun main() {
    val filterList = list.filter { it % 2 == 0 } // 원래 리스트는 불변 !
    println(filterList)

    val filterPerson = people2.filter { it.age > 30 }
    println(filterPerson)

    val squareList = list.map { it * it }
    println(squareList)

    val ageList = people2.map { it.age }
    println(ageList)

    val nameList = people2.map(Person2::name) // 메소드 레퍼런스를 넣으려면 중괄호 말고 소괄호를 넣어야 하는듯 ?
    println(nameList)

    val filterNameList = people2.filter { it.age > 30 }
        .map { it.name }
    println(filterNameList)

    val maxAge = people2.maxOf { it.age }

    val maxPersonName = people2.filter { it.age == maxAge }
        .map { it.name }

    println(maxPersonName)

    val allLow30 = people2.all(isLow30)
    println(allLow30)

    val anyLow30 = people2.any(isLow30)
    println(anyLow30)

    val findFirstLow30 = people2.find(isLow30)
    println(findFirstLow30)

    val countLow30 = people2.filter(isLow30).count()
    println(countLow30)

    val saveAgeList = people3.groupBy { it.age }
    println(saveAgeList)

    val printList = stringGroupList.groupBy(String::first)
    println(printList)
}