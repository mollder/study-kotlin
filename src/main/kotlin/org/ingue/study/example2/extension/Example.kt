package org.ingue.study.example2.extension

import java.lang.StringBuilder

class Example {
}

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) = this.setCharAt(length - 1, value)

val kotlinLogo = """| //
                   .| //
                   .|\ /"""
    .trimMargin(".")

fun main() {
    println("kotlin".lastChar)
    val sb = StringBuilder("kotlin?")
    sb.lastChar = '!'
    println(sb.toString())

    println()
    println(kotlinLogo)
}