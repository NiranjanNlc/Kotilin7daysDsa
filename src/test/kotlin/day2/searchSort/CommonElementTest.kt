package day2.searchSort

import org.junit.Assert.*
import org.junit.Test


class CommonElementsTest {

    @Test
    fun testCommonElements() {
        val array1 = intArrayOf(1, 5, 10, 20, 40, 80)
        val array2 = intArrayOf(6, 7, 20, 80, 100)
        val array3 = intArrayOf(3, 4, 15, 20, 30, 70, 80, 120)

        val expectedCommonElements = intArrayOf(20, 80)
        val commonElements = findCommonElements(array1, array2, array3)

        assertArrayEquals(expectedCommonElements, commonElements)
    }

    @Test
    fun testNoCommonElements() {
        val array1 = intArrayOf(1, 2, 3, 4, 5)
        val array2 = intArrayOf(6, 7, 8, 9, 10)
        val array3 = intArrayOf(11, 12, 13, 14, 15)

        val expectedCommonElements = intArrayOf()
        val commonElements = findCommonElements(array1, array2, array3)

        assertArrayEquals(expectedCommonElements, commonElements)
    }

    @Test
    fun testEmptyArray() {
        val array1 = intArrayOf()
        val array2 = intArrayOf(6, 7, 8)
        val array3 = intArrayOf(6, 8)

        val expectedCommonElements = intArrayOf()
        val commonElements = findCommonElements(array1, array2, array3)

        assertArrayEquals(expectedCommonElements, commonElements)
    }

    @Test
    fun testDuplicateCommonElements() {
        val array1 = intArrayOf(2, 5, 5, 10, 10)
        val array2 = intArrayOf(5, 10, 10, 15)
        val array3 = intArrayOf(5, 10, 10, 20)

        val expectedCommonElements = intArrayOf(5,10, 10)
        val commonElements = findCommonElements(array1, array2, array3)

        assertArrayEquals(expectedCommonElements, commonElements)
    }

    @Test
    fun testAllCommonElements() {
        val array1 = intArrayOf(1, 2, 3, 4, 5)
        val array2 = intArrayOf(1, 2, 3, 4, 5)
        val array3 = intArrayOf(1, 2, 3, 4, 5)

        val expectedCommonElements = intArrayOf(1, 2, 3, 4, 5)
        val commonElements = findCommonElements(array1, array2, array3)

        assertArrayEquals(expectedCommonElements, commonElements)
    }

    // Your function to find common elements goes here
    // Make sure it's named findCommonElements and takes three IntArray parameters

}
