//https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] ar = new int[cost.length];
        for (int i=0; i<cost.length; i++) {
            if (i < 2) {
                ar[i] = cost[i];
            }
            else {
                ar[i] = cost[i] + Math.min(ar[i-1], ar[i-2]);
            }
        }
        return Math.min(ar[cost.length-1], ar[cost.length-2]);
    }
}
