package day3.linkedlist

import day3.LinkedListNode

fun removeDuplicates(head: LinkedListNode?): LinkedListNode? {
    // Implementation of removeDuplicates function
    var curent = head
    var value = mutableListOf<Int>()
    curent?.let { value.add(it.value) }
    while (curent!= null)
    {
        var next = curent.nextNode
        if (value.contains(next?.value))
        {
            curent.nextNode = next?.nextNode
        }else{
            next?.let { value.add(it.value) }
            curent = next
        }

    }
    return head
}
