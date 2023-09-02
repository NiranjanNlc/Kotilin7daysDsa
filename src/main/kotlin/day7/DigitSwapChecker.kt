package day7

class DigitSwapChecker {
// Function to check if a list of numbers can be sorted by swapping adjacent elements
fun canSortBySwapping(numbers: MutableList<Int>): Boolean {
    // If the list is already sorted, return true
    if (isSorted(numbers)) {
        return true
    }

    // Iterate through the list of numbers
    for (i in 0 until numbers.size - 1) {
        // If the current number is greater than the next number
        if (numbers[i] > numbers[i + 1]) {
            // Try swapping adjacent elements and check if it results in a smaller number
            val swapped = trySwap(numbers[i], numbers[i + 1])

            // If a valid swap is found, update the list and check if it's sorted
            if (swapped != null) {
                numbers[i] = swapped
                // Output the current state of the list for debugging
                println(numbers)

                // If the list is sorted after the swap, return true
                if (isSorted(numbers)) {
                    return true
                } else {
                    // If not sorted, continue checking other possible swaps
                    continue
                }
            } else {
                // If no valid swap is found, return false
                return false
            }
        }
    }

    // If no valid swaps result in a sorted list, return false
    return false
}

// Function to check if a list is sorted in ascending order
fun isSorted(numbers: List<Int>): Boolean {
    for (i in 1 until numbers.size) {
        if (numbers[i] <= numbers[i - 1]) {
            return false
        }
    }
    return true
}

// Function to try swapping digits of a number to get a smaller number
fun trySwap(num: Int, numNext: Int): Int? {
    val numStr = num.toString().toCharArray()

    for (i in numStr.indices) {
        for (j in i + 1 until numStr.size) {
            // Try swapping digits at positions i and j
            val temp = numStr[i]
            numStr[i] = numStr[j]
            numStr[j] = temp

            // Convert the swapped string back to an integer
            val newNum = String(numStr).toInt()

            // If the new number is smaller than the next number, return it
            if (newNum < numNext) {
                return newNum
            }

            // Swap back to the original order for the next iteration
            numStr[j] = numStr[i]
            numStr[i] = temp
        }
    }

    // If no valid swap results in a smaller number, return null
    return null
}
}