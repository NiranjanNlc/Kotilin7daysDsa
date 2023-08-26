package day2.string

import org.junit.Assert.assertEquals
import org.junit.Test

class DuplicateCharactersTest {

 
        @Test
        fun testDuplicateCharacters1() {
            val input = "geeksforgeeks"
            val expectedOutput = listOf("e, count = 4", "g, count = 2", "k, count = 2", "s, count = 2")

            val result = findDuplicateCharacters(input)

            assertEquals(expectedOutput, result)
        }

        @Test
        fun testDuplicateCharacters2() {
            val input = "programming"
            val expectedOutput = listOf("r, count = 2", "g, count = 2", "m, count = 2")

            val result = findDuplicateCharacters(input)

            assertEquals(expectedOutput, result)
        }

        @Test
        fun testDuplicateCharacters3() {
            val input = "aabbccdd"
            val expectedOutput = listOf("a, count = 2", "b, count = 2", "c, count = 2", "d, count = 2")

            val result = findDuplicateCharacters(input)

            assertEquals(expectedOutput, result)
        }
    }
