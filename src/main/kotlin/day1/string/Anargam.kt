package day1.string




fun checkAnargam(w1: String , w2: String): Boolean
{
    var refinedW1 = w1.replace(" ","").lowercase()
    var refinedW2= w2.replace(" ","").lowercase()
    println(" $refinedW1 length is ${refinedW1.length}")
    println(" $refinedW2 length is ${refinedW2.length}")
    if (refinedW1.length != refinedW2.length) return false
    var frequencyw1 = mutableMapOf<Char,Int>()
    var frequencyw2 = mutableMapOf<Char,Int>()
    for(char in refinedW1 )
        frequencyw1[char] = frequencyw1.getOrDefault(char,0)+1
    for(char in refinedW2 )
        frequencyw2[char] = frequencyw2.getOrDefault(char,0)+1
    println(frequencyw1)
    println(frequencyw2)
    return frequencyw1.equals(frequencyw2)
}