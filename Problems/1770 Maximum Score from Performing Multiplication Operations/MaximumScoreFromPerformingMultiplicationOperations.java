//https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/

class Solution {
    private int n;
    private int m;
    public int maximumScore(int[] nums, int[] multipliers) {
        this.n = nums.length;
        this.m = multipliers.length;
        return helper(nums, multipliers, 0, n - 1, new Integer[m][m]);
    }

    private int helper(int[] nums, int[] multipliers, int i, int j, Integer[][] dp) {
        int index = (i - 0) + (n - 1 - j);
        if (index == m) return 0;
        if (dp[i][j - (n - m)] != null) return dp[i][j - (n - m)];
        int left = nums[i] * multipliers[index] + helper(nums, multipliers, i + 1, j, dp);
        int right = nums[j] * multipliers[index] + helper(nums, multipliers, i, j - 1, dp);
        int res = Math.max(left, right);
        return dp[i][j - (n - m)] = res;
    }
}
