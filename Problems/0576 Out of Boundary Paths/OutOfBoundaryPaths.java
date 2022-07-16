//https://leetcode.com/problems/out-of-boundary-paths/

class Solution {
    private int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int mod = 1000000000 + 7;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] memo = new long[m][n][maxMove+1];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                for (int k=0; k < maxMove+1; k++) {
                    memo[i][j][k] = -1;
                }
            }
        }
        return (int)(dfs(m, n, maxMove, startRow, startColumn, memo)%mod);
    }
    
    public long dfs(int m, int n, int moves, int i, int j, long[][][] memo) {
        if (i<0 || i>=m || j<0 || j>=n) {
            return 1;
        }
        if (moves == 0) return 0;
        if (memo[i][j][moves] != -1) return memo[i][j][moves];
        memo[i][j][moves] = 0;
        for (int dir[] : dirs) {
            int x = dir[0]+i;
            int y = dir[1]+j;
            memo[i][j][moves] = (memo[i][j][moves] + dfs(m, n, moves-1, x, y, memo)%mod)%mod;
        }
        return memo[i][j][moves];
    }
}
