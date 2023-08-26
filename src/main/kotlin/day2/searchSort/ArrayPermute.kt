package day2.searchSort


/*
Given two arrays of equal size n and an integer k.
The task is to permute both arrays such that sum of their corresponding element
is greater than or equal to k i.e a[i] + b[i] >= k.
The task is to print “Yes” if any such permutation exists, otherwise print “No”.
 */
fun canPermuteSatisfyCondition(a: IntArray, b: IntArray, k: Int): Boolean {

    if (a.size != b.size)
        return false
    for (i in a.indices)
    {
        if ((a[i]+b[i])>=k ) return true
    }
    return false
}
