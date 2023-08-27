package day3.linkedlist

import day3.LinkedListNode
import day3.createLinkedList
import day3.linkedlist.util.assertLinkedListEquals
import org.junit.Test
import org.junit.Assert.assertEquals



class ReverseLinkedListTest {

    @Test
    fun testReverseLinkedListWithSingleNode() {
        val head = createLinkedList(1)
        val reversedList = reverseLinkedList(head)
        val expected = createLinkedList(1)
        assertLinkedListEquals(expected, reversedList)
    }

    @Test
    fun testReverseLinkedListWithMultipleNodes() {
        val head = createLinkedList(1, 2, 3, 4, 5)
        val reversedList = reverseLinkedList(head)
        val expected = createLinkedList(5, 4, 3, 2, 1)
        assertLinkedListEquals(expected, reversedList)
    }
    @Test
    fun testReverseLinkedListWithMultipleNodes1() {
        val head = createLinkedList(1, 2, 3, 4, 5,6)
        val reversedList = reverseLinkedList(head)
        val expected = createLinkedList(6,5, 4, 3, 2, 1)
        assertLinkedListEquals(expected, reversedList)
    }
    @Test
    fun testReverseLinkedListWithMultipleNodes2() {
        val head = createLinkedList(9,1, 2, 3, 4, 5)
        val reversedList = reverseLinkedList(head)
        val expected = createLinkedList(5, 4, 3, 2, 1,9)
        assertLinkedListEquals(expected, reversedList)
    }

    @Test
    fun testReverseLinkedListWithEmptyList() {
        val reversedList = reverseLinkedList(null)
        val expected = null
        assertLinkedListEquals(expected, reversedList)
    }

    // Add more test functions for different scenarios




}
