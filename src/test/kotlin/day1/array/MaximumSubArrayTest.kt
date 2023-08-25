package day1.array

import org.junit.Assert.*
import org.junit.Test


class MaximumSubArrayTest
{
    @Test
    fun testKadaneAlgorithm() {
        val testCases = listOf(
            intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
            intArrayOf(1, 2, 3, 4, 5) to 15,
            intArrayOf(-1, -2, -3, -4, -5) to -1,
            intArrayOf(10, -2, 3, -5, 8, -1) to 14,
            intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3) to 7
        )

        for ((input, expected) in testCases) {
            val result = kadaneAlgorithm(input.toTypedArray())
             assertEquals(expected,result)
        }
    }
}