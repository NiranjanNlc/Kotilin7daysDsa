package day2.searchSort


import org.junit.Test
import org.junit.Assert.assertEquals

class FloorCeilingTest {

    @Test
    fun testFloorForNonExistentValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 0

        val expectedFloor = 1
        val floor = findFloor(array, x)

        assertEquals(expectedFloor, floor)
    }

    @Test
    fun testCeilForNonExistentValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 0

        val expectedCeil = 1
        val ceil = findCeil(array, x)

        assertEquals(expectedCeil, ceil)
    }

    @Test
    fun testFloorForExistingValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 5

        val expectedFloor = 2
        val floor = findFloor(array, x)

        assertEquals(expectedFloor, floor)
    }

    @Test
    fun testCeilForExistingValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 5

        val expectedCeil = 8
        val ceil = findCeil(array, x)

        assertEquals(expectedCeil, ceil)
    }

    @Test
    fun testFloorForGreaterValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 20

        val expectedFloor = 19
        val floor = findFloor(array, x)

        assertEquals(expectedFloor, floor)
    }

    @Test
    fun testCeilForGreaterValue() {
        val array = intArrayOf(1, 2, 8, 10, 10, 12, 19)
        val x = 20

        val expectedCeil = -1
        val ceil = findCeil(array, x)

        assertEquals(expectedCeil, ceil)
    }

    // Rest of the functions remain the same
}

