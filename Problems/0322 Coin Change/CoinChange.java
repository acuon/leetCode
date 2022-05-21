//https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<0) return 0;
        return getCoins(coins, amount, new int[amount+1]);
    }
    public int getCoins(int[] coins, int amount, int[] count) {
        if(amount<0) return -1;
        if(amount==0) return 0;
        if(count[amount]!=0) return count[amount];
        int min = Integer.MAX_VALUE;
        for(int coin: coins) {
            int res = getCoins(coins, amount-coin, count);
            if(res>=0 && res<min) {
                min = 1+res;
            }
        }
        count[amount] = (min==Integer.MAX_VALUE)?-1:min;
        return count[amount];
    }
}
