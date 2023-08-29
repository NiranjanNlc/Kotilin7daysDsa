package day4

import kotlin.system.exitProcess

/*

Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]*/
  fun spiralOrder1(matrix: Array<IntArray>): IntArray {
        TODO("Not yet implemented")
    }
fun spiralOrder(matrix1: Array<IntArray>):IntArray {
    var matrix = matrix1
    val result = mutableListOf<Int>()
    while (matrix.size > 0) {
        result.addAll(matrix[0].toList())
        matrix = matrix.drop(1).toTypedArray()
        if (checkmyMatrix(matrix)) break
        printmystatus(matrix, result)
        for (i in matrix.indices) {
            result.add(matrix[i].last())
            matrix[i] = matrix[i].dropLast(1).toIntArray()
        }
        if (checkmyMatrix(matrix)) break
        printmystatus(matrix, result)
        result.addAll(matrix.last().toList().reversed())
        matrix = matrix.dropLast(1).toTypedArray()
        if (checkmyMatrix(matrix)) break
        printmystatus(matrix, result)
        for (i in matrix.indices.reversed() ) {
            result.add(matrix[i].first())
            matrix[i] = matrix[i].drop(1).toIntArray()
        }
    }
    printmystatus(matrix, result)
    return result.toIntArray()
}

fun checkmyMatrix(matrix: Array<IntArray>): Boolean {
  return matrix.isEmpty()
}

private fun printmystatus(matrix: Array<IntArray>, result: MutableList<Int>) {
    matrix.forEach { println(it.toList()) }
    println(result)
}

fun main() {
    val matrix1 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    println(spiralOrder(matrix1))  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

    val matrix2 = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
    println(spiralOrder(matrix2))  // Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
}

