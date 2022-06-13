//https://leetcode.com/problems/triangle/

//top down approach

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n+1][n+1];
        int minSum = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                int curr = triangle.get(i-1).get(j-1);
                int min = Math.min(dp[i-1][j], dp[i-1][j-1]);
                if(i==j) min = dp[i-1][j-1];
                if(j==1) min = dp[i-1][j];
                dp[i][j] = curr + min;
            }
        }
        for(int i=1; i<=n; i++) minSum = Math.min(minSum, dp[n][i]);
        return minSum;
    }
}
