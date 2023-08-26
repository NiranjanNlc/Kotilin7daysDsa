package day2.string

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ValidParentheseTest {
        @Test
        fun testValidBrackets1() {
            val input = "()"
            assertTrue(isValid(input))
        }

        @Test
        fun testValidBrackets2() {
            val input = "()[]{}"
            assertTrue(isValid(input))
        }

        @Test
        fun testInvalidBrackets() {
            val input = "(]"
            assertFalse(isValid(input))
        }

        @Test
        fun testMixedBrackets() {
            val input = "({[]})"
            assertTrue(isValid(input))
        }

        @Test
        fun testUnbalancedBrackets() {
            val input = "([)]"
            assertFalse(isValid(input))
        }

        @Test
        fun testEmptyString() {
            val input = ""
            assertTrue(isValid(input))
        }
    }
