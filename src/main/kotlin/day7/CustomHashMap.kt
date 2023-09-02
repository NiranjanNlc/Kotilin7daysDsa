package day7

class CustomHashMap {
    // Function to perform a series of queries on a mutable map
    fun solution(queryType: MutableList<String>, query: MutableList<MutableList<Int>>): Long {
        // Initialize a mutable map to store key-value pairs
        val required = mutableMapOf<Int, Int>()
        var result = 0L // Initialize the result variable to store cumulative results

        // Iterate through the list of queries
        for (i in query.indices) {
            val data = query[i]

            // Perform the operation based on the query type
            when (queryType[i]) {
                "insert" -> {
                    // Insert a key-value pair into the map
                    required[data[0]] = data[1]
                }

                "addToValue" -> {
                    // Add a value to all existing values in the map
                    for ((key, value) in required) {
                        required[key] = value + data[0]
                    }
                }

                "addToKey" -> {
                    // Create a transformed map with updated keys and clear the original map
                    val transformed = required.mapKeys { it.key + data[0] }
                    required.clear()
                    required.putAll(transformed)
                }

                "get" -> {
                    // Retrieve a value from the map and add it to the result
                    result += required.getOrDefault(data[0], 0).toLong()
                }
            }
        }

        // Return the final result after processing all queries
        return result
    }
}