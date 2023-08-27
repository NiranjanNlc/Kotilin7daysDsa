package day3.linkedlist

import day3.LinkedListNode


fun mergeTwoLists(list1: LinkedListNode?, list2: LinkedListNode?): LinkedListNode? {
    var mergedList =  LinkedListNode(90)// Create a dummy node as the head of the merged list
    var current = mergedList
    var list1 = list1
    var list2 = list2
    while (list1 != null && list2 != null)
    {
        var next: LinkedListNode? = null
        if (list1.value < list2.value)
        {
            next = list1
            list1 = list1.nextNode
        }
        else
        {
            next = list2
            list2 = list2.nextNode
        }
        current.nextNode = next
        current = next
    }
    if (list1 != null ) current.nextNode =list1
    if (list2 != null ) current.nextNode =list2
    return mergedList.nextNode
}