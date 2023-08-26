package day2.searchSort

import org.junit.Assert.*
import org.junit.Test
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse

class PairDifferenceTest {

    @Test
    fun testPairExists() {
        val array = intArrayOf(5, 20, 3, 2, 50, 80)
        val n = 78

        assertTrue(hasPairWithDifference(array, n))
    }

    @Test
    fun testPairDoesNotExist() {
        val array = intArrayOf(90, 70, 20, 80, 50)
        val n = 45

        assertFalse(hasPairWithDifference(array, n))
    }

    @Test
    fun testNegativeDifference() {
        val array = intArrayOf(10, 20, 30, 40)
        val n = -10

        assertTrue(hasPairWithDifference(array, n))
    }

    @Test
    fun testZeroDifference() {
        val array = intArrayOf(5, 10, 15, 20)
        val n = 0

        assertTrue(hasPairWithDifference(array, n))
    }

}
