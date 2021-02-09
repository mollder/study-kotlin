package org.ingue.study.example3

open class User (nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)

open class Button2 // 디폴트 생성자 생성

class RadioButton : Button2()

class Secretive private constructor() {}

fun main() {
    val hyun = User("현석")
    println(hyun.isSubscribed)
}