//https://leetcode.com/problems/maximum-length-of-repeated-subarray/

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(nums1[i] == nums2[j]) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                    max = Math.max(max, dp[i+1][j+1]);
                }
            }
        }
        return max;
    }
}
