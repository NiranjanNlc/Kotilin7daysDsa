package day1.array

import org.junit.Test

class ReverseArrayStrngTest {
    @Test
    fun testReverseArray() {
        val originalArray = arrayOf(1, 2, 3, 4, 5)
        val reversedArray = reverseArray(originalArray)
        val expectedReversedArray = arrayOf(5, 4, 3, 2, 1)

        assert(reversedArray contentEquals expectedReversedArray) { "Array reversal test failed" }

        // Test with an empty array
        val emptyArray = emptyArray<Int>()
        val reversedEmptyArray = reverseArray(emptyArray)

        assert(reversedEmptyArray.isEmpty()) { "Empty array reversal test failed" }
    }
    @Test
    fun testReverseString() {
        val originalString = "Hello, World!"
        val reversedString = reverseString(originalString)
        val expectedReversedString = "!dlroW ,olleH"

        assert(reversedString == expectedReversedString) { "String reversal test failed" }

        // Test with an empty string
        val emptyString = ""
        val reversedEmptyString = reverseString(emptyString)

        assert(reversedEmptyString.isEmpty()) { "Empty string reversal test failed" }
    }
}