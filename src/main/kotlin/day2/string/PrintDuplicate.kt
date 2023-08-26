package day2.string
/*

Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

Example:

Input: S = “geeksforgeeks”
Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2*/
fun findDuplicateCharacters(input: String): String {
    var count = mutableMapOf<Char, Int>()
    for (ch in input) {
        count[ch] = count.getOrDefault(ch, 0) + 1
    }
    println(" $count for $input" )
    return count.entries.sortedBy { it.key }.joinToString(", ") {
        "[${it.key}, count = ${it.value}]"
    }
}