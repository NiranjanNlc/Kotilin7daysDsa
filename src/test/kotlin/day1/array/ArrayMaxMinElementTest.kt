package day1.array

import day1.array.findMax
import day1.array.findMin
import org.junit.Test
import org.junit.Assert.*

class ArrayMinMaxTest {

    @Test
    fun testBasicCase() {
        val arr = arrayOf(5, 2, 9, 1, 5, 6)
        assertEquals(9, findMax(arr))
        assertEquals(1, findMin(arr))
    }

    @Test
    fun testAllEqualElements() {
        val arr = arrayOf(3, 3, 3, 3, 3)
        assertEquals(3, findMax(arr))
        assertEquals(3, findMin(arr))
    }

    @Test
    fun testTwoElements() {
        val arr = arrayOf(8, 3)
        assertEquals(8, findMax(arr))
        assertEquals(3, findMin(arr))
    }

    @Test
    fun testNegativeNumbers() {
        val arr = arrayOf(-5, -12, -8, -2, -15)
        assertEquals(-2, findMax(arr))
        assertEquals(-15, findMin(arr))
    }

    @Test
    fun testLargeArray() {
        val arr = arrayOf(100, 200, 150, 300, 250, 50, 175, 125)
        assertEquals(300, findMax(arr))
        assertEquals(50, findMin(arr))
    }

    @Test
    fun testAscendingSorted() {
        val arr = arrayOf(1, 2, 3, 4, 5, 6)
        assertEquals(6, findMax(arr))
        assertEquals(1, findMin(arr))
    }

    @Test
    fun testDescendingSorted() {
        val arr = arrayOf(10, 8, 6, 4, 2, 0)
        assertEquals(10, findMax(arr))
        assertEquals(0, findMin(arr))
    }

    @Test
    fun testDuplicates() {
        val arr = arrayOf(7, 5, 9, 5, 7, 3, 9, 1)
        assertEquals(9, findMax(arr))
        assertEquals(1, findMin(arr))
    }

    @Test
    fun testEmptyArray() {
        val arr = emptyArray<Int>()
        assertNull(findMax(arr))
        assertNull(findMin(arr))
    }

    @Test
    fun testSingleElement() {
        val arr = arrayOf(6)
        assertEquals(6, findMax(arr))
        assertEquals(6, findMin(arr))
    }
}


