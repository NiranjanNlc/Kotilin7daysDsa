package day1.codeSignal

import org.junit.Assert.assertEquals
import org.junit.Test

class SubarraySumTest {

    private val solution = SubArraySum() // Replace with the actual class containing your solution

    @Test
    fun testExample1() {
        val a = intArrayOf(2, 4, 7, 5, 3, 5, 8, 5, 1, 7)
        val m = 4
        val k = 10
        assertEquals(5, solution.countSubArrayOfLengthMandSumK(a, m, k))
    }

    @Test
    fun testExample2() {
        val a = intArrayOf(15, 8, 8, 2, 6, 4, 1, 7)
        val m = 2
        val k = 8
        assertEquals(2, solution.countSubArrayOfLengthMandSumK(a, m, k))
    }
 
}
