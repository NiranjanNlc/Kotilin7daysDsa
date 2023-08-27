package day3.linkedlist

import day3.createLinkedList
import day3.linkedlist.util.assertLinkedListEquals
import org.junit.Test
import org.junit.Assert.assertEquals


class RemoveDuplicateTest {

    @Test
    fun testRemoveDuplicatesWithDuplicates() {
        val head = createLinkedList(1, 2, 2, 3, 4, 4, 5)
        val expected = createLinkedList(1, 2, 3, 4, 5)

        val result = removeDuplicates(head)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testRemoveDuplicatesWithNoDuplicates() {
        val head = createLinkedList(5, 10, 15, 20, 25)
        val expected = createLinkedList(5, 10, 15, 20, 25)

        val result = removeDuplicates(head)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testRemoveDuplicatesWithDuplicatesAtStart() {
        val head = createLinkedList(5, 5, 10, 15, 20)
        val expected = createLinkedList(5, 10, 15, 20)

        val result = removeDuplicates(head)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testRemoveDuplicatesWithDuplicatesAtEnd() {
        val head = createLinkedList(5, 10, 15, 20, 20)
        val expected = createLinkedList(5, 10, 15, 20)

        val result = removeDuplicates(head)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testRemoveDuplicatesWithEmptyList() {
        val head = null
        val expected = null

        val result = removeDuplicates(head)
        assertLinkedListEquals(expected, result)
    }


}
