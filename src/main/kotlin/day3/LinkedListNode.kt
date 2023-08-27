package day3

data class LinkedListNode(var  value: Int , var  nextNode : LinkedListNode? = null)
fun createLinkedList(vararg values: Int): LinkedListNode? {
    // createLinkedList implementation here
    var head: LinkedListNode? = null
    var  curremt : LinkedListNode? = null
    for (i in values)
    {
        val temp = LinkedListNode(i)
        if (head == null)
        {
            head = temp
            curremt = head
        } else{
            curremt?.nextNode = temp
            curremt = temp
        }
    }
    return head
}
fun displayLinkedList(head: LinkedListNode?) {
    var current = head
    while (current != null) {
        print("${current.value} -> ")
        current = current.nextNode
    }
    println("null")
}