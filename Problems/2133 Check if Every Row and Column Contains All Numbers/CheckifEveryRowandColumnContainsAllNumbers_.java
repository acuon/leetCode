//https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/

class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            for(int j=0; j<matrix[i].length; j++) {
                if(!row.add(matrix[i][j])) {
                    return false;
                }
                if(!col.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
