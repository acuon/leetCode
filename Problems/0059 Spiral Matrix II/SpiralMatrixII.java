//https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        while(num<=n*n) {
            for(int i=left; i<=right; i++) {
                arr[top][i] = num++;
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            for(int i=right; i>=left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;
            for(int i=bottom; i>=top; i--) {
                arr[i][left] = num++;
            }
            left++;
        }
        return arr;
    }
}/*
00 01 02
10 11 12
20 21 22
*/
