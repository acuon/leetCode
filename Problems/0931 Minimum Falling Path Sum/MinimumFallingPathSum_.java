//https://leetcode.com/problems/minimum-falling-path-sum/description/

class Solution {
    private Integer[][] dp;
    private int[][] moves = new int[][] {{1, -1}, {1, 0}, {1, 1}};
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        dp = new Integer[n][n];
        int min = Integer.MAX_VALUE;
        for(int j=0; j<n; j++) {
            dp[0][j] = getMinPath(matrix, n, 0, j);
            min = Math.min(min, dp[0][j]);
        }
        return min;
    }
    private int getMinPath(int[][] arr, int n, int i, int j) {
        if(dp[i][j] != null) return dp[i][j];
        int cost = Integer.MAX_VALUE;
        if(i>=0 && i<n && j>=0 && j<n) {
            for(int[] move: moves) {
                int x = i+move[0];
                int y = j+move[1];
                if(x>=0 && x<n && y>=0 && y<n) {
                    cost = Math.min(cost, getMinPath(arr, n, x, y));
                }
            }
        }
        if(cost == Integer.MAX_VALUE) cost = 0;
        dp[i][j] = cost + arr[i][j];
        return dp[i][j];
    }
}
