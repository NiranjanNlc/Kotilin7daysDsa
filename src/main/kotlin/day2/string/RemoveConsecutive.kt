package day2.string
/*

Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.*/
fun removeConsecutiveDuplicates(input: String): String {
   var required = StringBuilder()
   for ( ch in input)
   {
      if( required.isEmpty() || ch != required.last())
         required.append(ch)
   }
   return required.toString()
}