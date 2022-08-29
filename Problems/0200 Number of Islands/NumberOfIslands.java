//https://leetcode.com/problems/number-of-islands/

class Solution {
    public int numIslands(char[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == '1') {
                    cover(arr, i, j, n, m);
                    count++;
                }
            }
        }
        return count;
    }
    public void cover(char[][] arr, int i, int j, int n, int m) {
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j]=='0') return;
        arr[i][j] = '0';
        cover(arr, i-1, j, n, m);
        cover(arr, i+1, j, n, m);
        cover(arr, i, j-1, n, m);
        cover(arr, i, j+1, n, m);
    }
}
