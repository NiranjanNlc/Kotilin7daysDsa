package day1.codeSignal

class SubArraySum {
/*
Given an array of integers a, your task is to find
how many of its contiguous subarrays of length m
contain a pair of integers with a sum equal to k.
More formally, given the array a, your task is to
count the number of indices 0 ≤ i ≤ a.length - m
such that a subarray [a[i], a[i + 1], ..., a[i + m - 1]]
contains at least one pair (a[s], a[t]), where:
s ≠ t
a[s] + a[t] = k
 */

    fun countSubArrayOfLengthMandSumK1(a: IntArray, m: Int, k: Int): Int {
        var elementCount = mutableMapOf<Int,Int>()
        var count = 0
        var start = 0
        var end = 0
        println(" arrya ${a.joinToString(" ")} with value m $m and k $k ")
        while( end < a.size)
        {
            // Iterate through the array using the right pointer
            val currentElement = a[end] // Get the current element at the right pointer
            elementCount[currentElement] = elementCount.getOrDefault(currentElement,0) +1
            // Shrink the window if it becomes larger than m
            if (end - start + 1 > m) {
                println("$end - $start +1 is gretaet than $m so $elementCount")
                val leftElement = a[start] // Get the leftmost element of the window
                // Reduce the frequency count of the left element as it's leaving the window
                elementCount[leftElement] = elementCount[leftElement]!! - 1
                // If the left element's count becomes zero, remove it from the window's frequency count
                if (elementCount[leftElement] == 0) {
                    elementCount.remove(leftElement)
                }
                println(elementCount)
                // Move the left pointer to make the window smaller
                start++
            }
            val complement = k - currentElement
            println(" complemt  $complement will be  in $elementCount" )
            if (elementCount.containsKey(complement) ) {
                // If the complement is in the window and not the same as the current element,
                // add the frequency of the complement to the count
                println(" complemt  $complement is contained in $elementCount" )
                count += elementCount[complement]!!
            }
            // Move the right pointer to expand the window
            end++
            }
      return count
    }
    fun countSubArrayOfLengthMandSumK2(a: IntArray, m: Int, k: Int): Int {
        var count = 0
        var windowSum = 0
        val elementCount = mutableMapOf<Int, Int>()
        var left = 0

        for (right in 0 until a.size) {
            elementCount[a[right]] = elementCount.getOrDefault(a[right], 0) + 1
            windowSum += a[right]
            if (right - left + 1 > m) {
                elementCount[a[left]] = elementCount[a[left]]!! - 1
                if (elementCount[a[left]] == 0) {
                    elementCount.remove(a[left])
                }
                windowSum -= a[left]
                left++
            }
            if (right - left + 1 == m && windowSum == k) {
                count++
            }
        }
        return count
    }
    fun countSubArrayOfLengthMandSumK(a: IntArray, m: Int, k: Int): Int {
        var elementCount = mutableMapOf<Int, Int>()
        var count = 0
        var start = 0
        var end = 0

        while (end < a.size) {
            val currentElement = a[end]
            elementCount[currentElement] = elementCount.getOrDefault(currentElement, 0) + 1

            if (end - start + 1 > m) {
                val leftElement = a[start]
                elementCount[leftElement] = elementCount[leftElement]!! - 1
                if (elementCount[leftElement] == 0) {
                    elementCount.remove(leftElement)
                }
                start++
            }

            if (end - start + 1 == m) {
                val complement = k - currentElement
                if (elementCount.containsKey(complement) && elementCount[complement] != currentElement) {
                    count++
                }
            }

            end++
        }
        return count
    }


}