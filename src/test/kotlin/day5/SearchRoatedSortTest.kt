package day5

import org.junit.Assert.*

import org.junit.Test
import org.junit.Assert

class RotatedSortedArraySearchTest {

    @Test
    fun testSearchRotatedArray_case1() {
        val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 0
        val expected = 4
        val result = searchRotatedArray(nums, target)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testSearchRotatedArray_case2() {
        val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 3
        val expected = -1
        val result = searchRotatedArray(nums, target)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testSearchRotatedArray_case3() {
        val nums = intArrayOf(1)
        val target = 0
        val expected = -1
        val result = searchRotatedArray(nums, target)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testSearchRotatedArray_case4() {
        val nums = intArrayOf(30, 40, 50, 10, 20)
        val target = 10
        val expected = 3
        val result = searchRotatedArray(nums, target)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testSearchRotatedArray_case5() {
        val nums = intArrayOf(5, 6, 7, 8, 1, 2, 3, 4)
        val target = 6
        val expected = 1
        val result = searchRotatedArray(nums, target)
        Assert.assertEquals(expected, result)
    }

    // Implement the searchRotatedArray function here
    // Make sure to use the algorithm with O(log n) runtime complexity

}
