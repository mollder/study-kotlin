package org.ingue.study.leetcode

import java.util.*

class Solution {

    fun isValid(s: String): Boolean {
        val parenthesesStack = ArrayDeque<Char>()

        for(value in s.toCharArray()) when {
            isOpenParentheses(value) -> parenthesesStack.push(value)
            !parenthesesStack.isEmpty() && isMatch(value, parenthesesStack.peek()) -> parenthesesStack.pop()
            else -> return false
        }

        return parenthesesStack.isEmpty()
    }
}

val parenthesesMap = hashMapOf(')' to '(', '}' to '{', ']' to '[')
fun isOpenParentheses(value : Char) = parenthesesMap.containsValue(value)
fun isCloseParentheses(value : Char) = parenthesesMap.containsKey(value)
fun isMatch(value : Char, peekValue : Char) = isCloseParentheses(value) && peekValue == parenthesesMap.get(value)