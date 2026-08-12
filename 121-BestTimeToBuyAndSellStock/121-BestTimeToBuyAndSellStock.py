# Last updated: 8/12/2026, 11:22:00 AM
class Solution:
    def maxProfit(self, prices):
        min_price = float('inf')
        max_profit = 0

        for price in prices:
            if price < min_price:
                min_price = price  # update lowest price seen so far
            else:
                profit = price - min_price
                if profit > max_profit:
                    max_profit = profit

        return max_profit
