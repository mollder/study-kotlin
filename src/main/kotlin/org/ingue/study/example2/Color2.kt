package org.ingue.study.example2

import org.ingue.study.example.Color
import org.ingue.study.example.Color.*

fun getWarmth(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw IllegalArgumentException("Dirty color")
        }

fun mix2(c1: Color, c2: Color) =
        when {
            isRedOrYellow(c1, c2) -> ORANGE
            isYellowOrBlue(c1, c2) -> GREEN
            isBlueOrViolet(c1, c2) -> INDIGO
            else -> throw IllegalArgumentException("Dirty color")
        }

fun isRedOrYellow(c1: Color, c2: Color) = (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED)
fun isYellowOrBlue(c1: Color, c2: Color) = (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW)
fun isBlueOrViolet(c1: Color, c2: Color) = (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE)

fun main() {
    val blue = getWarmth(BLUE)
    println(blue)

    println(mix(BLUE, YELLOW))

    println(mix2(BLUE, YELLOW))
}