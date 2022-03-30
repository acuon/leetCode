//https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchColumn(matrix, target);
    }
    public boolean searchColumn(int[][] mat, int target) {
        int lo = 0;
        int hi = mat.length-1;
        int n = mat[0].length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(mat[mid][0]<= target && mat[mid][n]>=target) {
                return searchRow(mat[mid], target);
            }
            if(mat[mid][0] > target) {
                hi = mid-1;
            }
            if(mat[mid][0] < target) {
                lo = mid+1;
            }
        }
        return false;
    }
    public boolean searchRow(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target) {
                return true;
            }
            if(arr[mid] > target) {
                hi = mid-1;
            }
            if(arr[mid] < target) {
                lo = mid+1;
            }
        }
        return false;
    }
}
