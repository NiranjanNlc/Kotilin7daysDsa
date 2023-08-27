import day3.stackqueue.evaluate
import org.junit.Test
import org.junit.Assert

class PostfixEvaluatorTest {

    @Test
    fun testSimpleAddition() {
        val result = evaluate("5 3 +")
        Assert.assertEquals(8, result)
    }

    @Test
    fun testComplexExpression() {
        val result = evaluate("4 2 5 * + 7 -")
        Assert.assertEquals(7, result)
    }

    @Test
    fun testAnotherComplexExpression() {
        val result = evaluate("8 2 3 * + 5 /")
        Assert.assertEquals(2, result)
    }

    @Test
    fun testOnlyOneOperand() {
        val result = evaluate("6")
        Assert.assertEquals(6, result)
    }

    @Test
    fun testDivisionByZero() {
        val result = evaluate("8 0 /")
        Assert.assertEquals(Int.MAX_VALUE, result) // Assuming your function returns a special value for division by zero
    }

    @Test
    fun testNegativeNumbers() {
        val result = evaluate("-3 2 *")
        Assert.assertEquals(-6, result)
    }

    @Test
    fun testMissingOperand() {
        val result = evaluate("4 +")
        Assert.assertEquals(Int.MIN_VALUE, result) // Assuming your function returns a special value for missing operands
    }

    @Test
    fun testExtraOperands() {
        val result = evaluate("5 6 + 7")
        Assert.assertEquals(Int.MIN_VALUE, result) // Assuming your function returns a special value for extra operands
    }

    @Test
    fun testInvalidOperator() {
        val result = evaluate("4 2 #")
        Assert.assertEquals(Int.MIN_VALUE, result) // Assuming your function returns a special value for invalid operators
    }

    @Test
    fun testLongAdditionAndSubtraction() {
        val result = evaluate("10 5 + 15 7 - +")
        Assert.assertEquals(23, result)
    }

    @Test
    fun testMixOfOperators() {
        val result = evaluate("4 3 + 5 * 6 2 / -")
        Assert.assertEquals(32, result)
    }

    @Test
    fun testLargerExpressionWithParentheses() {
        val result = evaluate("7 3 + 2 * 8 4 / 3 * +")
        Assert.assertEquals(26, result)
    }

    @Test
    fun testMultipleDigitNumbers() {
        val result = evaluate("25 15 + 3 * 10 -")
        Assert.assertEquals(110, result)
    }

    @Test
    fun testComplexExpressionWithUnaryMinus() {
        val result = evaluate("12 6 - 8 2 / 3 * -")
        Assert.assertEquals(-6, result)
    }

    @Test
    fun testDivisionByLargeOperand() {
        val result = evaluate("100 2 50 * /")
        Assert.assertEquals(1, result)
    }

    @Test
    fun testExpressionWithDuplicateOperators() {
        val result = evaluate("6 3 + +")
        Assert.assertEquals(Int.MIN_VALUE, result) // Assuming your function returns a special value for duplicate operators
    }

    @Test
    fun testUnbalancedOperators() {
        val result = evaluate("4 5 + 3 - *")
        Assert.assertEquals(Int.MIN_VALUE, result) // Assuming your function returns a special value for unbalanced operators
    }

    @Test
    fun testRandomMixOfOperatorsAndNumbers() {
        val result = evaluate("8 4 * 3 + 6 / 2 - 1 +")
        Assert.assertEquals(33, result)
    }

    // Add more test cases as needed...

}
