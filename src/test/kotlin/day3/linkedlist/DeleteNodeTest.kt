package day3.linkedlist

import day3.createLinkedList
import day3.linkedlist.util.assertLinkedListEquals
import org.junit.Assert.*

import org.junit.Test
import org.junit.Assert.assertEquals



class DeleteNodeTest {

    @Test
    fun testDeleteNodeWithValueInList() {
        val head = createLinkedList(1, 2, 3, 4, 5)
        val target = 3
        val expected = createLinkedList(1, 2, 4, 5)
        val result = deleteNode(head, target)
        println(target)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testDeleteNodeWithTargetAtBeginning() {
        val head = createLinkedList(5, 10, 15, 20)
        val target = 5
        val expected = createLinkedList(10, 15, 20)

        val result = deleteNode(head, target)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testDeleteNodeWithTargetAtEnd() {
        val head = createLinkedList(5, 10, 15, 20)
        val target = 20
        val expected = createLinkedList(5, 10, 15)
        val result = deleteNode(head, target)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testDeleteNodeWithTargetNotInList() {
        val head = createLinkedList(5, 10, 15, 20)
        val target = 8
        val expected = createLinkedList(5, 10, 15, 20)

        val result = deleteNode(head, target)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testDeleteNodeWithEmptyList() {
        val head = null
        val target = 5
        val result = deleteNode(head, target)
        assertNull(result)
    }
}
