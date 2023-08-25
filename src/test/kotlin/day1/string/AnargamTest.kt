package day1.string

import org.junit.Test
import org.junit.Assert

class AnagramTest {

    @Test
    fun testBasicAnagrams() {
        val result = checkAnargam("listen", "silent")
        Assert.assertTrue(result)
    }

    @Test
    fun testNonAnagrams() {
        val result = checkAnargam("hello", "world")
        Assert.assertFalse(result)
    }

    @Test
    fun testAnagramsWithDifferentCasing() {
        val result = checkAnargam("Tea", "Eat")
        Assert.assertTrue(result)
    }

    @Test
    fun testAnagramsWithDifferentSpacing() {
        val result = checkAnargam("astronomer", "moon starer")
        Assert.assertTrue(result)
    }

    @Test
    fun testAnagramAndNonAnagram() {
        val result = checkAnargam("listen", "silentt")
        Assert.assertFalse(result)
    }

    @Test
    fun testEmptyStrings() {
        val result = checkAnargam("", "")
        Assert.assertTrue(result)
    }

    @Test
    fun testDifferentLengths() {
        val result = checkAnargam("triangle", "integral")
        Assert.assertTrue(result)
    }

    @Test
    fun testLargeAnagrams() {
        val result = checkAnargam("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba")
        Assert.assertTrue(result)
    }

    @Test
    fun testLargeNonAnagrams() {
        val result = checkAnargam("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedca")
        Assert.assertFalse(result)
    }

    @Test
    fun testMixedCharacters() {
        val result = checkAnargam("abc123", "321bca")
        Assert.assertTrue(result)
    }
}
