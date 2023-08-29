package day4

import org.junit.Assert.*
import org.junit.Test

class MatrixZeroTest


class SetMatrixZeroesTest {
    @Test
    fun testExample1() {
        val matrix = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        val expected = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))
        
        assertArrayEquals(expected, setZeroes(matrix))
    }

    @Test
    fun testExample2() {
        val matrix = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        val expected = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 4, 5, 0), intArrayOf(0, 3, 1, 0))
        
        assertArrayEquals(expected, setZeroes(matrix))
    }

    @Test
    fun testEmptyMatrix() {
        val matrix = arrayOf<IntArray>()
        val expected = arrayOf<IntArray>()
        
        assertArrayEquals(expected, setZeroes(matrix))
    }

    @Test
    fun testSingleElementMatrix() {
        val matrix = arrayOf(intArrayOf(0))
        val expected = arrayOf(intArrayOf(0))
        
        assertArrayEquals(expected, setZeroes(matrix))
    }

    @Test
    fun testNoZeros() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        
        assertArrayEquals(expected, setZeroes(matrix))
    } // Add more test cases as needed...
}

