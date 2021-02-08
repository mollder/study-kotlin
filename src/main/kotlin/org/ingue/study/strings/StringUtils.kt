package org.ingue.study.strings

import java.lang.StringBuilder

fun String.lastChar() : Char = this[this.length - 1] // 확장함수 : 클래스.함수명 으로 생성가능

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "(",        // default 값 지정가능
    postfix: String = ")"
) : String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val stringEx = "예제"

    println(stringEx.lastChar())
    println("kotlin".lastChar())
}