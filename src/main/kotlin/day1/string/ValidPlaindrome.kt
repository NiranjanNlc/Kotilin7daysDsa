package day1.string


    fun checkPlaindrome(words : String): Boolean
    {
        var refinedWord  = words.lowercase().replace("[^a-z0-9]".toRegex(),"")
        println(words + " goes " + refinedWord)
        return  refinedWord.equals(refinedWord.reversed())
    }
