//https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int area = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    area = Math.max(area, dfs(grid, i, j, 0));
                }
            }
        }
        return area;
    }
    public int dfs(int[][] grid, int i, int j, int area) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) {
            return 0;
        }
        grid[i][j] = 0;
        area++;
        area += dfs(grid, i-1, j, 0);
        area += dfs(grid, i+1, j, 0);
        area += dfs(grid, i, j-1, 0);
        area += dfs(grid, i, j+1, 0);
        return area;
    }
}
