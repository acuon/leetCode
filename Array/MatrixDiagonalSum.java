/*
//https://leetcode.com/problems/matrix-diagonal-sum/submissions/

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:

Input: mat = [[5]]
Output: 5

Constraints:

    n == mat.length == mat[i].length
    1 <= n <= 100
    1 <= mat[i][j] <= 100

*/


//Method 1
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i=0,j=n-1; i<n; i++,j--) {
            sum += mat[i][i];
            mat[i][i] = 0;      // replacing all the values left to right diagonal with zero after adding
            sum += mat[i][j];    //even if both diagonals intersect it will only add it single time
        }
        
        return sum;
    }
}

//Method 2
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i=0,j=n-1; i<n; i++,j--) {
            sum += mat[i][i] + mat[i][j];
        }
		/*
		checking if the length of matrix is even or odd
		if it is even there are no common element in both diagonals and it will not go in if condition
		if it is  odd both diagonals will have a single common element in the centre(at intersection point) and will substract it from the sum
		*/
        if(n%2!=0) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
