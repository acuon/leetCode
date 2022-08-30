//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n-j-1][n-i-1];
                arr[n-j-1][n-i-1] = temp;
            }
        }
    }
}
/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/
