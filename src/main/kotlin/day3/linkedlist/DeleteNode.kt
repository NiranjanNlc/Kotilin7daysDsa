package day3.linkedlist

import day3.LinkedListNode

/*
* You are given a singly linked list and a target value.
* Implement a function deleteNode to delete the first
*  occurrence of the target value from the linked list.
* If the target value does not exist in the list, no changes should be made.
* Your task is to modify the linked list in-place and return the modified head.*/
fun deleteNode(head: LinkedListNode?, target: Int): LinkedListNode? {
    var currentNode = head
    if (currentNode?.value == target)
        return currentNode.nextNode
    while (currentNode != null) {
        var next = currentNode.nextNode
        if (next?.value == target) {
            currentNode.nextNode = next.nextNode
        }
        currentNode = next
    }
    return head
}