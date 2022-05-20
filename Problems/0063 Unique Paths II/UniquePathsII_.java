//https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] path = new int[m][n];
        
        for(int i=0; i<m; i++) {
            if(arr[i][0] == 0) {
                path[i][0] = 1;
            } else {
                break;
            }
        }
        for(int j=0; j<n; j++) {
            if(arr[0][j] == 0) {
                path[0][j] = 1;
            } else {
                break;
            }
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(arr[i][j] == 1) {
                    path[i][j] = 0;
                } else {
                    path[i][j] = path[i-1][j]+path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
}
