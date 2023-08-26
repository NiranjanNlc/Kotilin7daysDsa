package day2.searchSort


import org.junit.Test
import org.junit.Assert.assertEquals

class StepArrayTest {

    @Test
    fun testFirstOccurrence() {
        val array = intArrayOf(4, 5, 6, 7, 6)
        val k = 1
        val x = 6

        val expectedIndex = 2
        val index = findFirstOccurrence(array, k, x)

        assertEquals(expectedIndex, index)
    }

    @Test
    fun testFirstOccurrenceMultipleElements() {
        val array = intArrayOf(20, 40, 50, 70, 70, 60)
        val k = 20
        val x = 70

        val expectedIndex = 3
        val index = findFirstOccurrence(array, k, x)

        assertEquals(expectedIndex, index)
    }

    @Test
    fun testKeyNotFound() {
        val array = intArrayOf(10, 20, 30, 40, 50)
        val k = 15
        val x = 35

        val expectedIndex = -1
        val index = findFirstOccurrence(array, k, x)

        assertEquals(expectedIndex, index)
    }

    @Test
    fun testStepSizeEqualsZero() {
        val array = intArrayOf(5, 5, 5, 5, 5)
        val k = 0
        val x = 5

        val expectedIndex = 0
        val index = findFirstOccurrence(array, k, x)

        assertEquals(expectedIndex, index)
    }

    @Test
    fun testEmptyArray() {
        val array = intArrayOf()
        val k = 5
        val x = 10

        val expectedIndex = -1
        val index = findFirstOccurrence(array, k, x)

        assertEquals(expectedIndex, index)
    }


}
