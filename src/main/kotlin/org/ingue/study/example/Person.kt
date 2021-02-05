package org.ingue.study.example

data class Person(val name: String, val age: Int? = null)

class Person2(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    println(question)

    val answer = 42
    println(answer)

    val answer2: Int = 42
    println(answer2)

    var mutableAnswer = 41
    println("변경전 : $mutableAnswer")

    mutableAnswer = 42
    println("변경후 : $mutableAnswer")

    val message: String

    if (true) {
        message = "성공"
    } else {
        message = "실패"
    }

    println("메시지는 ? $message")

    val list = arrayListOf(1)
    list.add(2)

    for(value in list) {
        println(value)
    }

    val persons = listOf(Person("영희"), Person("철수", age = 29))

    val oldest = persons.maxByOrNull { it.age?: 0 } // age가 null이면 0으로 쳐라
    println("나이가 가장 많은 사람: $oldest")

    val converter = PersonConverter("변환된 이름")
    println("컨버터 이름 = ${converter.name}")

    val person2 = Person2("Bob", true)
    println(person2.name)
    println(person2.isMarried)
}
