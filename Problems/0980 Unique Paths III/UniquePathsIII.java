//https://leetcode.com/problems/unique-paths-iii/description/

class Solution {
    private int res = 0;
    private int empty = 1;
    private final int[][] dirs = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int si = 0;
        int sj = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 0) empty++;
                else if (grid[i][j] == 1) {
                    si = i;
                    sj = j;
                }
            }
        }
        dfs(grid, si, sj);
        return res;
    }

    private void dfs(int[][] arr, int x, int y) {
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || arr[x][y] < 0) {
            return;
        }
        if (arr[x][y] == 2) {
            if (empty == 0) res++;
            return;
        }
        arr[x][y] = -2;
        empty--;
        for(int[] dir: dirs) {
            dfs(arr, x + dir[0], y + dir[1]);
        }
        arr[x][y] = 0;
        empty++;
    }
}
