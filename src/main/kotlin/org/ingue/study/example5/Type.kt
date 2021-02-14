package org.ingue.study.example5

val answer : Any = 42

val nullIntList : List<Int?> = listOf(1, null, 2)
//val nullListFail : List<Int?> = null
val nullList : List<Int>? = null
val nullListNullType : List<Int?>? = listOf(null, 1)
val nonNullList = nullIntList.filterNotNull()

val set = setOf(1, 2, 3) // 내부에서는 변경가능한 클래스이지만, 기본적으로 add메소드는 없음

val first = arrayListOf(1, 2, 3)
val second : Collection<Int> = first

val letters = Array<String>(26) { i -> ('a' + i).toString()}

val strings = listOf("a", "b", "c")
val stringArrays = strings.toTypedArray()

val fiveZeros = IntArray(5)
val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
val squared = IntArray(5) { i -> (i+1) * (i+1) }

fun fail(message: String) : Nothing {
    throw IllegalStateException(message)
}

fun main() {
//    fail("Error occurred")
    println(nullIntList)
    println(nullList)
    println(nullListNullType)
    println(nonNullList)

    println(second)
    first.add(4)
    println(second)
    println(first)

    println(letters.joinToString(""))
    println(stringArrays.joinToString(""))

    println(fiveZeros.joinToString(" "))
    println(fiveZerosToo.joinToString(" "))
    println(squared.joinToString(" "))

    squared.forEachIndexed { index, element ->
        println("인덱스 : $index, 값 : $element")
    }

}
