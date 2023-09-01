package day6

import org.junit.Assert.*
import org.junit.Test

class RepeatAndMissingNumberTest  {

    @Test
    fun testBasicCase() {
        val input = intArrayOf(3, 1, 2, 5, 3)
        val expected = intArrayOf(3, 4)
        val result = findMissingAndDuplicate(input)
        assertArrayEquals(expected, result)
    }



    @Test
    fun testMissingAtBeginning() {
        val input = IntArray(51) { if (it == 0) 50 else it+1 }
        val expected = intArrayOf( 50,1)
        val result = findMissingAndDuplicate(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testMissingAtEnd() {
        val input = IntArray(51) { if (it == 49) 51 else it + 1 }
        val expected = intArrayOf(51, 50)
        val result = findMissingAndDuplicate(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testRandomOrder() {
        val input = intArrayOf(5, 3, 1, 2, 4, 7, 6, 8, 9, 3)
        val expected = intArrayOf(3, 10)
        val result = findMissingAndDuplicate(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSmallInput() {
        val input = intArrayOf(2, 1)
        val expected = intArrayOf()
        val result = findMissingAndDuplicate(input)
        assertArrayEquals(expected, result)
    }


}
