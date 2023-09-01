package day6
/*You are given an n x n 2D matrix representing an image,
rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place,
which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.*/

fun rotate(matrix: Array<IntArray>): Array<IntArray> {
    printmatrux(matrix)
     var n = matrix.size -1
     for (i in matrix.indices)
     {
         for (j in i .. n)
         {
             var  temo = matrix[i][j]
             matrix[i][j] = matrix[j][i]
             matrix[j][i] = temo
         }
     }
    for (i in matrix.indices)
       matrix[i]= matrix[i].reversed().toIntArray()
    printmatrux(matrix)
    return matrix
}

fun printmatrux(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element\t") // Use "\t" for tab separation between elements
        }
        println() // Move to the next line for the next row
    }
}
