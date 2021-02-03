package org.ingue.study.example

class HelloWorld {

}

fun max(a:Int, b:Int) : Int {
    return if (a > b) a else b
}

fun oneLineMax(a:Int, b:Int) : Int = if (a > b) a else b

fun main(args: Array<String>) {
    println(oneLineMax(2, 3))
    println(max(2, 3))
    println("Hello, World")
}