package org.ingue.study.example2.collection

import org.ingue.study.strings.joinToString

val list = arrayListOf(1, 7, 53)
val list2 = listOf(1, 7, 52) // Arrays 의 arraylist ( 추가가 안되는 )
val set = hashSetOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
val strings = listOf("first", "second", "fourteenth")
val numbers = setOf(1, 14, 2) // LinkedHashSet

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(list2.javaClass)
    println(map.javaClass)
    println(numbers.javaClass)

    println(strings.last())
    println(numbers.maxOrNull())

    println(strings)

    println(strings.joinToString())
    println(strings.joinToString(separator = "; "))
    println(strings.joinToString(prefix = "{", postfix = "}"))
    println(strings.joinToString(separator = " ", prefix = "(", postfix = ")"))
}
