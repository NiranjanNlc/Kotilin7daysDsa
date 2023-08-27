package day3.linkedlist

import day3.createLinkedList
import day3.displayLinkedList
import day3.linkedlist.util.assertLinkedListEquals
import org.junit.Assert.*
import org.junit.Test

class MergeLinkedListTest {

    @Test
    fun testMergeTwoNonEmptyLists() {
        val list1 = createLinkedList(1, 2, 4)
        val list2 = createLinkedList(1, 3, 4)
        val expected = createLinkedList(1, 1, 2, 3, 4, 4)
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithOneEmptyList() {
        val list1 = createLinkedList(1, 3, 5)
        val list2 = null
        val expected = createLinkedList(1, 3, 5)

        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithBothEmptyLists() {
        val list1 = null
        val list2 = null
        val expected = null
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithOneListLonger() {
        val list1 = createLinkedList(1, 3, 5, 7, 9)
        val list2 = createLinkedList(2, 4, 6)
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val expected = createLinkedList(1, 2, 3, 4, 5, 6, 7, 9)

        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithBothEqualLists() {
        val list1 = createLinkedList(2, 4, 6)
        val list2 = createLinkedList(2, 4, 6)
        val expected = createLinkedList(2, 2, 4, 4, 6, 6)
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithOneEmptyAndOneSingleNode() {
        val list1 = createLinkedList(3)
        val list2 = null
        val expected = createLinkedList(3)
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testMergeWithNegativeValues() {
        val list1 = createLinkedList(-5, -3, -1)
        val list2 = createLinkedList(-4, -2, 0)
        val expected = createLinkedList(-5, -4, -3, -2, -1, 0)
        println(displayLinkedList(list1))
        println(displayLinkedList(list2))
        val result = mergeTwoLists(list1, list2)
        assertLinkedListEquals(expected, result)
    }

    // Add more test cases here

}
