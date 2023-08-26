package day2.string


/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings*/
fun longestCommonPrefix(strs: Array<String>): String{
    if (strs.isEmpty())
        return ""
    var shortest = strs.minBy { it.length }
    var commonPrefix = ""
    println("$shortest in ${strs.joinToString (" ")}")
    for(i in shortest.indices ) {
        var commonchar = shortest[i]
        if (strs.any { it.length <= i || it[i] != commonchar }) {
            println(" $commonchar is from $shortest to $commonPrefix")
            return commonPrefix
        } else {
            commonPrefix = commonPrefix.plus(commonchar)
            println(" $commonchar is from $shortest to $commonPrefix")
        }
    }
     return  commonPrefix
}