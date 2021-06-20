/*
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/


Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0

Example 3:

Input: grid = [[1,-1],[-1,-1]]
Output: 3

Example 4:

Input: grid = [[-1]]
Output: 1

 

Constraints:

    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    -100 <= grid[i][j] <= 100

 
Follow up: Could you find an O(n + m) solution?

*/

//first approach (0ms Runtime)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
         for(int[] a:grid) {
             for(int i=0; i<a.length; i++) {
                 if(a[i]<0) {
                     count += a.length-i;
                     break;
                 }
             }
         }
        return count;
    }
}


//Another approach (5ms Runtime) - using only single loop
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int i = 0;
        for(int j=0; j<grid[i].length; j++) {
            if(grid[i][j]<0) count++;
            //System.out.print(grid[i][j]+" ");
            if(j==grid[i].length-1 && i<grid.length-1) {
                i++;
                j=-1;
                System.out.println();
            }
        }
        return count;
    }
}
