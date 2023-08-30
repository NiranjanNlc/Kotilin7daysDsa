package day5

import org.junit.Assert
import org.junit.Test

class MaxProfitTest {

    @Test
    fun testExample1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testExample2() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testEmptyArray() {
        val prices = intArrayOf()
        val expected = 0
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testAscendingPrices() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testDescendingPrices() {
        val prices = intArrayOf(5, 4, 3, 2, 1)
        val expected = 0
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testMixedPrices() {
        val prices = intArrayOf(1, 7, 3, 5, 6, 2, 8)
        val expected = 7
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun testConstantPrices() {
        val prices = intArrayOf(3, 3, 3, 3, 3)
        val expected = 0
        val result = maxProfit(prices)
        Assert.assertEquals(expected, result)
    }
}
