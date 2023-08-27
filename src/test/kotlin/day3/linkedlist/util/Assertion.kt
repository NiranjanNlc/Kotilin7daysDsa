package day3.linkedlist.util

import day3.LinkedListNode
import day3.displayLinkedList
import org.junit.Assert.assertEquals


fun assertLinkedListEquals(expected: LinkedListNode?, actual: LinkedListNode?) {
    // assertLinkedListEquals implementation here
    var expectedCurrent = expected
    var actualCurrent = actual
    displayLinkedList(expected)
    displayLinkedList(actual)
    while (expectedCurrent != null && actualCurrent != null) {
        assertEquals(expectedCurrent.value, actualCurrent.value)
        expectedCurrent = expectedCurrent.nextNode
        actualCurrent = actualCurrent.nextNode
    }
    assertEquals(expectedCurrent, actualCurrent)
}
