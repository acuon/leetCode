//https://leetcode.com/problems/minimum-falling-path-sum/description/

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        fillMinPath(matrix, matrix.length-2);
        int min = matrix[0][0];
        for(int j=0; j<matrix.length; j++) {
            min = Math.min(min, matrix[0][j]);
        }
        return min;
    }
    private void fillMinPath(int[][] arr, int n) {
        if(n < 0) return;
        for(int j=0; j<arr.length; j++) {
            int min = arr[n+1][j];
            if(j != 0) {
                min = Math.min(min, arr[n+1][j-1]);
            }
            if(j != arr.length-1) {
                min = Math.min(min, arr[n+1][j+1]);
            }
            arr[n][j] += min;
        }
        fillMinPath(arr, n-1);
    }
}
/*
00 01 02
10 11 12
20 21 22
*/
