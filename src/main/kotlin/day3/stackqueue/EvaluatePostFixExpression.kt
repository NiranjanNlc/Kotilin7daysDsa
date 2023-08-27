package day3.stackqueue

 /*
 Given a postfix expression, the task is to evaluate the postfix expression.
Postfix expression: The expression of the form “a b operator” (ab+) i.e.,
when a pair of operands is followed by an operator.
Examples:
Input: str = “2 3 1 * + 9 -“
Output: -4
Explanation: If the expression is converted into an infix expression,
 it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.
  */
fun evaluate(s: String): Int {
  var stack = ArrayDeque<Int>()
   var refined = s.replace(" ","")
  println(s)
  for (ch in refined )
  {
   println(ch)
   println(ch.isDigit())
   if (ch.isDigit())
   {
    stack.addLast(ch.digitToInt())
    println(stack)
   } else{
    println(" here $ch")
    var val1 = stack.removeLast()
    var val2 = stack.removeLast()
     when (ch)
     {
      '+' -> stack.add(val1+val2)
      '-' -> stack.add(val1-val2)
      '*' -> stack.add(val1*val2)
      '/' -> stack.add(val1/val2)
       else -> return Int.MIN_VALUE
     }
   }
  }
 return stack.first()
}