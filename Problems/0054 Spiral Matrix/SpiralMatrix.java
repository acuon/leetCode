//https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int left = 0;
        int right = m-1;
        int up = 0;
        int down = n-1;
        List<Integer> arr = new ArrayList<>();
        while(true) {
            if(arr.size()==n*m) break;
            for(int i=left; i<=right; i++) {
                arr.add(mat[up][i]);
            }
            up++;
            if(arr.size()==n*m) break;
            for(int i=up; i<=down; i++) {
                arr.add(mat[i][right]);
            }
            right--;
            if(arr.size()==n*m) break;
            for(int i=right; i>=left; i--) {
                arr.add(mat[down][i]);
            }
            down--;
            if(arr.size()==n*m) break;
            for(int i=down; i>=up; i--) {
                arr.add(mat[i][left]);
            }
            left++;
        }
        return arr;
    }
}
/*
1  2  3  4
5  6  7  8 
9 10 11 12

i=0 -> up
i=n-1 -> down
j=0 -> left
j=m-1 -> right
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/
