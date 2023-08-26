package day2.string

import org.junit.Test
import org.junit.Assert.assertEquals

class RemoveConsecutiveDuplicatesTest {

    @Test
    fun testRemoveConsecutiveDuplicates1() {
        val input = "aabb"
        val expectedOutput = "ab"

        val result = removeConsecutiveDuplicates(input)

        assertEquals(expectedOutput, result)
    }

    @Test
    fun testRemoveConsecutiveDuplicates2() {
        val input = "aabaa"
        val expectedOutput = "aba"

        val result = removeConsecutiveDuplicates(input)

        assertEquals(expectedOutput, result)
    }

    @Test
    fun testNoConsecutiveDuplicates() {
        val input = "abcdef"
        val expectedOutput = "abcdef"

        val result = removeConsecutiveDuplicates(input)

        assertEquals(expectedOutput, result)
    }

    @Test
    fun testAllConsecutiveDuplicates() {
        val input = "11111111"
        val expectedOutput = "1"

        val result = removeConsecutiveDuplicates(input)

        assertEquals(expectedOutput, result)
    }

    @Test
    fun testEmptyString() {
        val input = ""
        val expectedOutput = ""

        val result = removeConsecutiveDuplicates(input)

        assertEquals(expectedOutput, result)
    }


}
