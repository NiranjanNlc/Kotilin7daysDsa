package day4

import org.junit.Assert.*
import org.junit.Test


class SpiralMatrixTest {
    @Test
    fun testExample1() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = intArrayOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
        val result: IntArray = spiralOrder(matrix)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testExample2() {
        val matrix = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val expected = intArrayOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
       
        val result: IntArray = spiralOrder(matrix)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testEmptyMatrix() {
        val matrix = arrayOf<IntArray>()
        val expected = intArrayOf()
        val result: IntArray = spiralOrder(matrix)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSingleElementMatrix() {
        val matrix = arrayOf(intArrayOf(42))
        val expected = intArrayOf(42)
       
        val result: IntArray = spiralOrder(matrix)
        assertArrayEquals(expected, result)
    } // Add more test cases as needed...
    @Test
    fun testSquareMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expected = intArrayOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
        val result = spiralOrder(matrix)
        assertEquals(expected.toList(), result.toList())
    }

    @Test
    fun testRectangleMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8)
        )
        val expected = intArrayOf(1, 2, 3, 4, 8, 7, 6, 5)
val result = spiralOrder(matrix)
        assertEquals(expected.toList(), result.toList())
    }

    @Test
    fun testLargerMatrix() {
        val matrix = Array(4) { IntArray(5) }
        var counter = 1
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                matrix[i][j] = counter++
            }
        }
        matrix.forEach { println(it.toList()) }
        val expected = intArrayOf(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12)
        val result = spiralOrder(matrix)
        assertEquals(expected.toList(), result.toList())
    }
} 

