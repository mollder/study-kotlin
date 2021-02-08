package org.ingue.study.example3

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk")
}

internal fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
}

fun main() {
    TalkativeButton().giveSpeech()
}
