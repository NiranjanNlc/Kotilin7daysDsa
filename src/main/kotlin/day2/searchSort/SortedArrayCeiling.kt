package day2.searchSort



/*
Given a sorted array and a value x,
the ceiling of x is the smallest element in an array greater than or equal to x,
 and the floor is the greatest element smaller than or equal to x.
 Assume that the array is sorted in non-decreasing order.
 Write efficient functions to find the floor and ceiling of x.
Examples :
For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
 */
fun findFloor(arr: IntArray, x: Int): Int {
    val index = arr.binarySearch(x)
    if (index >= 0) {
        return arr[index]
    } else {
        val insertionPoint = -index - 1
        return if (insertionPoint == 0) -1 else arr[insertionPoint - 1]
    }
}

fun findCeil(arr: IntArray, x: Int): Int {
    val index = arr.binarySearch(x)
    if (index >= 0) {
        return arr[index]
    } else {
        val insertionPoint = -index - 1
        return if (insertionPoint < arr.size) arr[insertionPoint] else -1
    }
}