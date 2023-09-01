package day6

import org.junit.Assert.*
import org.junit.Test

class StringToKeyPadSequenceTest
{
    @Test
    fun testBasicSentence() {
        assertEquals("4433555555666096667775553", sentenceToKeyPadSequence("Hello World"))
    }
    @Test
    fun testEmptySentence() {
        assertEquals("", sentenceToKeyPadSequence(""))
    }

    @Test
    fun testSentenceWithSpaces() {
        assertEquals("0222222000", sentenceToKeyPadSequence(" ABC   "))
    }

    @Test
    fun testSentenceWithLowerCaseLetters() {
        assertEquals("4433555555666096667775553", sentenceToKeyPadSequence("hello world"))
    }


}
