package day3.linkedlist

import day3.LinkedListNode


fun reverseLinkedList(head: LinkedListNode?): LinkedListNode? {
    var  prev : LinkedListNode?=null
    var currentNode: LinkedListNode? = head

    while (currentNode != null )
    {
        var next = currentNode.nextNode
        currentNode.nextNode = prev
        prev = currentNode
        currentNode = next
    }
    return prev
}