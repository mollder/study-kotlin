package org.ingue.study.example3

interface User3 {
    val nickname: String // 추상 프로퍼티
}

class PrivateUser(override val nickname: String) : User3 // 생성자 이용 방법

class SubscribingUser(val email: String) : User3 {
    override val nickname: String
        get() = email.substringBefore('@')
} // 커스텀 게터 이용 방법

interface User4 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class User5(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$address" -> "$value".
            """.trimIndent())
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        internal set // 가시성 변경

    fun addWord(word: String) {
        counter += word.length
    }
}

data class Client(val name: String, val postalCode: Int)

fun main() {
    val client1 = Client("오현석", 4122)
    val client2 = Client("오현석", 4122)
    println(client1)
    println(client1 == client2)

    val client3 = Client("오현석", 4122)
    val hashSet = hashSetOf(Client("오현석", 4122))
    println(hashSet.contains(client3))

    val client4 = Client("오현석", 4122)
    val client5 = client4.copy(name = "이인규")
    println(client4)
    println(client5)

    val user5 = User5("ingue")
    println(user5.address)
    user5.address = "a"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hay")
    println(lengthCounter.counter)
}