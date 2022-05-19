//https://leetcode.com/problems/shortest-path-in-binary-matrix/

class Solution {
    
    private int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        grid[0][0] = 1;
        int pathCost = 1;
        while(!que.isEmpty()) {
            int size = que.size();
            for(int q=0; q<size; q++) {
                int[] cur = que.poll();
                if(cur[0]==n-1 && cur[1]==n-1) return pathCost;
                for(int[] dir: dirs) {
                    int i = cur[0]+dir[0];
                    int j = cur[1]+dir[1];
                    if(i<0 || j<0 || i>=n || j>=n || grid[i][j]==1) {
                        continue;
                    } else {
                        que.add(new int[]{i, j});
                        grid[i][j] = 1;
                    }
                }
            }
            pathCost++;
        }
        return -1;
    }
}
