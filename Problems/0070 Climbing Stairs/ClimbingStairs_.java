//https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    private int[] memo = new int[46];
    public int climbStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(memo[n] != 0) return memo[n];
        int stepOne = climbStairs(n-1);
        int stepTwo = climbStairs(n-2);
        memo[n] = stepOne + stepTwo;
        return memo[n];
    }
}
