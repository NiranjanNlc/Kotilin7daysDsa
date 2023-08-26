package day2.searchSort

import org.junit.Assert.*
import org.junit.Test

class ArrayPermuteTest
{
    @Test
    fun testExample1() {
        val a = intArrayOf(2, 1, 3)
        val b = intArrayOf(7, 8, 9)
        val k = 10
        assertTrue(canPermuteSatisfyCondition(a, b, k))
    }

    @Test
    fun testExample2() {
        val a = intArrayOf(1, 2, 2, 1)
        val b = intArrayOf(3, 3, 3, 4)
        val k = 5
        assertTrue(canPermuteSatisfyCondition(a, b, k))
    }

    @Test
    fun testCustom1() {
        val a = intArrayOf(1, 2, 3)
        val b = intArrayOf(4, 5, 6)
        val k = 7
        assertTrue(canPermuteSatisfyCondition(a, b, k))
    }

    @Test
    fun testCustom2() {
        val a = intArrayOf(1, 2, 3)
        val b = intArrayOf(4, 5, 6)
        val k = 10
        assertFalse(canPermuteSatisfyCondition(a, b, k))
    }
}
