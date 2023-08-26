package day2.string

import org.junit.Test
import org.junit.Assert.assertEquals

class LongestCommonPrefixTest {

    @Test
    fun testCommonPrefix() {
        val strs = arrayOf("flower", "flow", "flight")
        val expected = "fl"

        val result = longestCommonPrefix(strs)

        assertEquals(expected, result)
    }

    @Test
    fun testNoCommonPrefix() {
        val strs = arrayOf("dog", "racecar", "car")
        val expected = ""

        val result = longestCommonPrefix(strs)

        assertEquals(expected, result)
    }

    @Test
    fun testEmptyArray() {
        val strs = emptyArray<String>()
        val expected = ""

        val result = longestCommonPrefix(strs)

        assertEquals(expected, result)
    }

    @Test
    fun testSingleString() {
        val strs = arrayOf("single")
        val expected = "single"

        val result = longestCommonPrefix(strs)

        assertEquals(expected, result)
    }

}
