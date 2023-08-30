package day5

/*
You are given an array prices
 where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */
    fun maxProfit(prices: IntArray): Int
    {
        if (prices.isEmpty()) return 0
        var minPrice =prices[0]
        var maxProfitTill = 0
        println(prices.toList())

            for (price in prices) {
                println(" price : $price , minprice : $minPrice , maxprofit : $maxProfitTill")
                if (price < minPrice) {
                    minPrice = price
                } else {
                    maxProfitTill = maxOf(maxProfitTill, price - minPrice)
                }
            }

    return maxProfitTill
    }
