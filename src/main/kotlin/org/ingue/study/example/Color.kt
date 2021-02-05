package org.ingue.study.example

import java.lang.IllegalArgumentException

enum class Color(
        private val r: Int,
        private val g: Int,
        private val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
            Color.BLUE -> throw IllegalArgumentException("blue is not allowed")
        }

fun getWarmth(color: Color) =
        when (color) {
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }

fun main() {
    val color = Color.BLUE.rgb()

    println(color)
    println(getMnemonic(Color.BLUE))

    println(getWarmth(Color.ORANGE))
}