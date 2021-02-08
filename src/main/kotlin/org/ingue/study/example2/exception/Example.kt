package org.ingue.study.example2.exception

import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return line.toInt()
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        reader.readLine().toInt()
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun is0To100(percentage : Int) {
    if (percentage !in 0 .. 100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
    }
}

fun main() {
    val reader = BufferedReader(StringReader("not number"))
//    println(readNumber(reader))
    println(readNumber2(reader))
}