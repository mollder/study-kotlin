package org.ingue.study.example4

object Payroll {
    val allEmployees = arrayListOf<Int>()
}

class NonCompanionUser {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(faceookId: Int) {
        nickname = (faceookId+1).toString()
    }
}

data class CompanionUser constructor(val nickname: String){
    companion object {
        fun newSubscribingUser(email: String) = CompanionUser(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = CompanionUser((accountId+1).toString())
    }
}

fun main() {
    val payroll1 = Payroll
    val payroll2 = Payroll

    println(payroll1 == payroll2)

    val nonCompanionUser = NonCompanionUser(email = "mollder@naver.com")
    val companionUser = CompanionUser.newSubscribingUser("mollder@naver.com")
}