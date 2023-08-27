package day3.linkedlist

import day3.LinkedListNode

fun removeDuplicates(head: LinkedListNode?): LinkedListNode? {
    // Implementation of removeDuplicates function
    var curent = head
    var value = mutableListOf<Int>()
    while (curent!= null)
    {
        var next = curent.nextNode
        if (value.contains(next?.value))
        {
            curent.nextNode = next?.nextNode
        }else{
            curent = next
        }

    }
    return head
}
