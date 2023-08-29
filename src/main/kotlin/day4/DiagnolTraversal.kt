package day4
/*
Given a 2D matrix, print all elements of the given matrix in diagonal order.
 For example, consider the following 5 X 4 input matrix.
Example:
1     2     3     4
5     6     7     8
9    10    11    12
13    14    15    16
17    18    19    20
Diagonal printing of the above matrix is
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20*/
 fun diagonalPrint(matrix: Array<IntArray>): List<List<Int>> {
    // Implement your diagonal printing function here
    // This function should take the 2D matrix as input and return the diagonal printing as a List of Lists
     var required = mutableListOf<List<Int>>()
    if (matrix.isEmpty()) return emptyList()
    var rows =0
    matrix.forEach { println(it.toList()) }
    while (rows < matrix.size)
    {
        var i = rows
        var j = 0
        var intarray = mutableListOf<Int>()
        while (j<= rows)
        {
            intarray.add(matrix[i][j])
            i--
            j++
        }
        println(intarray)
        required.add(intarray)
        rows++
    }
    println(" here is the rows value $rows")
    rows = rows-1
    var column = 1
    while ( column < matrix[0].size)
    {
        var i = rows
        var j = column
        var intarray = mutableListOf<Int>()
        while ( j  <   matrix[0].size && i >=0 )
        {
            println(matrix[i][j])
            intarray.add(matrix[i][j])
            println(" $i  and ${matrix[i][j]} thus $j")
            i--
            j++
        }
        println(intarray)
        required.add(intarray)
        column++
    }
 return required.toList()
}