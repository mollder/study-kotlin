package org.ingue.study.example

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(2, 2)
    println(rectangle.isSquare)
}