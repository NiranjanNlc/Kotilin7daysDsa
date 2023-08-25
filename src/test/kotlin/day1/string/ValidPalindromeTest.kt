package day1.string

import org.junit.Assert.*

import org.junit.Test
import org.junit.Assert.assertEquals

class ValidPalindromeTest {

    @Test
    fun testPalindrome1() {
        val input = "A man, a plan, a canal, Panama!"
        val expected = true
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome2() {
        val input = "race a car"
        val expected = false
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome3() {
        val input = "Was it a car or a cat I saw?"
        val expected = true
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome4() {
        val input = "12321"
        val expected = true
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome5() {
        val input = "hello"
        val expected = false
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome6() {
        val input = ""
        val expected = true
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome7() {
        val input = "Able, was I, I saw elba"
        val expected = true
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome8() {
        val input = "Palindrome"
        val expected = false
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome9() {
        val input = "1a2"
        val expected = false
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

    @Test
    fun testPalindrome10() {
        val input = "testing 123"
        val expected = false
        val result = checkPlaindrome(input)
        assertEquals(expected, result)
    }

}
