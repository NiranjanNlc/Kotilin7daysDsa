package day2.searchSort

/*

Given an unsorted array and a number n,
find if there exists a pair of elements in the array
whose difference is n.
Examples:
Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
Output: Pair Found: (2, 80)
Input: arr[] = {90, 70, 20, 80, 50}, n = 45
Output: No Such Pair
 */
fun hasPairWithDifference(arr: IntArray, n: Int): Boolean {

    for (i in arr )
    {
        var complement = i - n
        if (arr.contains(complement)) return true
    }
    return false
}