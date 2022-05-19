//https://leetcode.com/problems/longest-increasing-path-in-a-matrix/

class Solution {
    //00 01 02
    //10 11 12
    //20 21 22
    int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] visited = new int[m][n];
        int max = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int tempMax = dfs(matrix, i, j, visited);
                max = Math.max(max, tempMax);
            }
        }
        
        return max;
    }
    public int dfs(int[][] arr, int dx_i, int dy_j, int[][] visited) {
        if(visited[dx_i][dy_j] != 0) return visited[dx_i][dy_j];
        int maxSteps = 1;
        for(int[] dir: directions) {
            int i = dir[0]+dx_i;
            int j = dir[1]+dy_j;
            if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]<=arr[dx_i][dy_j]) {
                continue;
            } else {
                int steps = 1 + dfs(arr, i, j, visited);
                maxSteps = Math.max(steps, maxSteps);
            }
        }
        visited[dx_i][dy_j] = maxSteps;
        return maxSteps;
    }
}
