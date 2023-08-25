package day1.array


    fun kadaneAlgorithm( array: Array<Int>): Int {
        var maxEndHere:Int = 0
        var maxSoFar: Int = array[0]
        println("$maxEndHere  $maxSoFar")
        for (i in 0..<array.size)
        {
            println(" in array ${array.joinToString(",")} , i am in $i ")
            maxEndHere = maxOf(array[i],maxEndHere+ array[i] )
            println(maxEndHere)
            maxSoFar = maxOf(maxEndHere,maxSoFar)
            println(maxSoFar)
        }
        return maxSoFar
    }
