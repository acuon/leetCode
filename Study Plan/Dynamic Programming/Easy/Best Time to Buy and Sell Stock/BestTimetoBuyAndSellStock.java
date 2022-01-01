//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int buy = prices[0];
        int profit = 0;
        for(int i: prices) {
            if(i>buy) {
                profit = Math.max(profit, i-buy);
            } else if(i<buy) {
                buy = i;
            }
        }
        return profit;
    }
}
