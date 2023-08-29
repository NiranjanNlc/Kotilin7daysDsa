package day4

import org.junit.Assert.*

import org.junit.Test

class DiagnolTraversalTest {
    @Test
    fun testBasicMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expectedOutput = listOf(
            listOf(1),
            listOf(4, 2),
            listOf(7, 5, 3),
            listOf(8, 6),
            listOf(9)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testRectangularMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        val expectedOutput = listOf(
            listOf(1),
            listOf(5, 2),
            listOf(9, 6, 3),
            listOf(10, 7, 4),
            listOf(11, 8),
            listOf(12)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testLargerMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14,15)
        )
        val expectedOutput = listOf(
            listOf(1),
            listOf(6, 2),
            listOf(11, 7, 3),
            listOf(12, 8, 4),
            listOf(13, 9, 5),
            listOf(14, 10),
            listOf(15)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testSquareMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expectedOutput = listOf(
            listOf(1),
            listOf(4, 2),
            listOf(7, 5, 3),
            listOf(8, 6),
            listOf(9)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testSingleElementMatrix() {
        val matrix = arrayOf(
            intArrayOf(42)
        )
        val expectedOutput = listOf(
            listOf(42)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testEmptyMatrix() {
        val matrix = emptyArray<IntArray>()
        val expectedOutput = emptyList<List<Int>>()

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testNegativeNumbersMatrix() {
        val matrix = arrayOf(
            intArrayOf(-1, -2, -3),
            intArrayOf(-4, -5, -6),
            intArrayOf(-7, -8, -9)
        )
        val expectedOutput = listOf(
            listOf(-1),
            listOf(-4, -2),
            listOf(-7, -5, -3),
            listOf(-8, -6),
            listOf(-9)
        )

        val result = diagonalPrint(matrix)
        assertEquals(expectedOutput, result)
    }


}
