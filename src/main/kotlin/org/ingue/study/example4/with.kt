package org.ingue.study.example4

fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet2() : String {
    val stringBuilder = StringBuilder()

    return with(stringBuilder) {
        for(letter in 'A'..'Z') {
            append(letter)
        }

        append("\nNow I know the alphabet!")
        toString()
    }
}

fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
    toString() // 여기에서는 리턴을 안함 ??
}

fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
}.toString()

fun alphabet5() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet())
    println(alphabet2())
    println(alphabet3())
    println(alphabet4())
    println(alphabet5())
}
