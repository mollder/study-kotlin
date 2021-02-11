package org.ingue.study.leetcode

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for((index, value) in nums.withIndex()) {
            val secondValue = target - value

            if (nums.contains(secondValue) && nums.indexOf(secondValue) != index) {
                val secondIndex = nums.indexOf(secondValue)

                return listOf(index, secondIndex).toIntArray()
            }
        }

        return arrayListOf<Int>().toIntArray()
    }
}