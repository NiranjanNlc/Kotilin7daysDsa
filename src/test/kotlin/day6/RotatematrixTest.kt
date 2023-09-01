package day6

import org.junit.Assert.*
import org.junit.Test
 

class RotatematrixTest {

    @Test
    fun testRotate3x3Matrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expected = arrayOf(
            intArrayOf(7, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(9, 6, 3)
        )
         
        assertArrayEquals(expected, rotate(matrix))
    }


    @Test
    fun testRotate4x4Matrix() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        val expected = arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11)
        )
         
        assertArrayEquals(expected, rotate(matrix))
    }

    @Test
    fun testRotate2x2Matrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        val expected = arrayOf(
            intArrayOf(3, 1),
            intArrayOf(4, 2)
        )
         
        assertArrayEquals(expected, rotate(matrix))
    }

    @Test
    fun testRotateEmptyMatrix() {
        val matrix = arrayOf<IntArray>()
        val expected = arrayOf<IntArray>()
         
        assertArrayEquals(expected, rotate(matrix))
    }

    @Test
    fun testRotate1x1Matrix() {
        val matrix = arrayOf(intArrayOf(1))
        val expected = arrayOf(intArrayOf(1))
         
        assertArrayEquals(expected, rotate(matrix))
    }

    @Test
    fun testRotateSquareMatrixWithSameElements() {
        val matrix = arrayOf(
            intArrayOf(9, 9, 9),
            intArrayOf(9, 9, 9),
            intArrayOf(9, 9, 9)
        )
        val expected = arrayOf(
            intArrayOf(9, 9, 9),
            intArrayOf(9, 9, 9),
            intArrayOf(9, 9, 9)
        )
         
        assertArrayEquals(expected, rotate(matrix))
    }

    @Test
    fun testRotateSquareMatrixWithSingleElement() {
        val matrix = arrayOf(intArrayOf(5))
        val expected = arrayOf(intArrayOf(5))
         
        assertArrayEquals(expected, rotate(matrix))
    }
}
