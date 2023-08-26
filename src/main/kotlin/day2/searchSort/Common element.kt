package day2.searchSort

/*
Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.
 */

fun findCommonElements(array1: IntArray, array2: IntArray, array3: IntArray): IntArray
{
    var commonElement = mutableListOf<Int>()
    var smallestArray = listOf(array1,array2,array3).minBy { it.size }
    for( i in smallestArray)
    {
        if (array1.contains(i) && array2.contains(i) && array3.contains(i))
            commonElement.add(i)
    }
    return commonElement.toIntArray()
}