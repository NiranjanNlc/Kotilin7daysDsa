package day6
/*
Given a sentence in the form of a string,
convert it into its equivalent mobile numeric keypad sequence.
Input: GEEKSFORGEEKS
Output: 4333355777733366677743333557777
Explanation: For obtaining a number,
 we need to press a number corresponding to that character
 for a number of times equal to the position of the character.
 For example, for character E, press number 3 two times and accordingly.
 */
fun sentenceToKeyPadSequence(s: String): String {
    val keypadSequences = arrayOf("2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999")
    var required = StringBuilder()
    println(s.uppercase())
    for (character in s.uppercase() ) {
//        println(required)
        if (character.equals(' ',false)) {
            println("spaces ")
            required.append("0")
            println(required.toString())
        } else if (character in 'A'..'Z')
        {
            var position = character.toInt().minus('A'.toInt())
            required.append(keypadSequences[position!!])
        }
    }
    return required.toString()
}