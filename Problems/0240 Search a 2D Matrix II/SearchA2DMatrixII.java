//https://leetcode.com/problems/search-a-2d-matrix-ii/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++) {
            if(matrix[i][0]>target) return false;
            if(matrix[i][n-1]>=target) {
                if(searchRow(matrix[i], target)) {
                    return true;
                }
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
