//https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++) {
            boolean[] row = new boolean[n+1];
            boolean[] col = new boolean[n+1];
            for(int j=0; j<n; j++) {
                if(row[matrix[i][j]] || col[matrix[j][i]]) {
                    return false;
                }
                row[matrix[i][j]] = true;
                col[matrix[j][i]] = true;
            }
        }
        return true;
    }
}
