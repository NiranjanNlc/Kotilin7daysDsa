package day1.array

import day1.array.checkContainsDuplicate
import org.junit.Assert.assertEquals
import org.junit.Test

class ContainsDuplicateTest {

    @Test
    fun testNoDuplicates() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = checkContainsDuplicate(nums)
        assertEquals(false, result)
    }

    @Test
    fun testWithDuplicates() {
        val nums = intArrayOf(1, 2, 3, 2)
        val result = checkContainsDuplicate(nums)
        assertEquals(true, result)
    }

    @Test
    fun testAllDuplicates() {
        val nums = intArrayOf(7, 7, 7, 7)
        val result = checkContainsDuplicate(nums)
        assertEquals(true, result)
    }

    @Test
    fun testEmptyArray() {
        val nums = intArrayOf()
        val result = checkContainsDuplicate(nums)
        assertEquals(false, result)
    }

    @Test
    fun testSingleElement() {
        val nums = intArrayOf(1)
        val result = checkContainsDuplicate(nums)
        assertEquals(false, result)
    }

    @Test
    fun testNegativeDuplicates() {
        val nums = intArrayOf(10, -5, 3, -5, 10)
        val result = checkContainsDuplicate(nums)
        assertEquals(true, result)
    }

    // Add more test cases as needed
}
