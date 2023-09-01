package day6
/*You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.
Note: Your algorithm should have a linear runtime complexity.
 Could you implement it without using extra memory?
Note that in your output A should precede B.
Example:
Input:[3 1 2 5 3]
Output:[3, 4]
A = 3, B = 4*/
 fun findMissingAndDuplicate(input: IntArray): IntArray? {
     var dulicate = -1
    var number = hashSetOf<Int>()
   var actualSum =0
    for (i in input)
    {
        if (!number.add(i)) dulicate = i
       actualSum += i
    }
   if (dulicate == -1) return intArrayOf()
    println(input.toList())
    println(dulicate)
    var n = input.size
    var totalExpectedSum = n*(n+1)/2
    println("$totalExpectedSum is $actualSum and $dulicate")
    var missing = totalExpectedSum - actualSum + dulicate
    var required = intArrayOf(dulicate,missing)
    println(required)
    return required
}