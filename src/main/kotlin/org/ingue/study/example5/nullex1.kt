package org.ingue.study.example5

import kotlin.text.isNullOrEmpty as isStringNullOrEmpty

fun strLen(s: String?) = s?.length ?: 0

val x: String? = "3"
val y: String = x ?: "0"

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase() // if s == null null else s.toUpperCase()
    println(allCaps)
}

data class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name // null이 예상되는 곳에는 전부 표시를 해주어야 함!

data class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
data class Company(val name: String, val address: Address?)
data class Person(val name: String, val company: Company?)

fun Person.countryName() : String {
    val country = this.company?.address?.country // null 처리를 매우 간결하게 할 수 있음 !
    return country ?: "Unknown"
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")

    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun foo(s: String?) {
    val t: String = s ?: "null null"
    println(t)
}

fun strLenSafe(s: String?) : Int = s?.length ?: 2

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun printIntCode(t: Int) {
    println(t.hashCode())
}

fun main() {
    println(strLen(null))
    println(y)

    printAllCaps(null)
    printAllCaps("abc")

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)

    println(managerName(ceo))
    println(developer)

    val person = Person("Dmitry", null)
    println(person.countryName())

    foo(null)
    println(strLenSafe(null))
    println(strLenSafe("abc"))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Dmitry", jetbrains)

    printShippingLabel(person1)
//    printShippingLabel(Person("Alexey", null))
//    ignoreNulls(null)

    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null

    email?.let { sendEmailTo(it) } // null이기 때문에 let 함수 안의 내용이 실행이 안됨.

    println(email.isStringNullOrEmpty())
}
