//https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[n][m];
        for(int[] ar: arr) {
            Arrays.fill(ar, 1);
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}
