package day4
/*Given an m x n integer matrix matrix,
if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1 */
 fun setZeroes(given: Array<IntArray>):Array<IntArray>
 {
     var matrix = given
     var rowZero = mutableSetOf<Int>()
     var columnZero = mutableSetOf<Int>()
     matrix.forEach { println(it.toList()) }
     for (i in matrix.indices) {
         for (j in matrix[0].indices)
         {
             if(matrix[i][j]==0)
             {
                 rowZero.add(i)
                 columnZero.add(j)
             }
         }
     }
     println(rowZero)
     println(columnZero)
     for (i in matrix.indices) {
         for (j in matrix[0].indices)
         {
             if( i in rowZero || j in columnZero)
             {
                 println(true)
                 matrix[i][j] =0
             }
         }
     }
     matrix.forEach { println(it.toList()) }

     return matrix
 }