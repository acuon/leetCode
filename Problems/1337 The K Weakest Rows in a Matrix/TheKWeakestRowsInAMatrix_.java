//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        for(int i=0; i<mat.length; i++) {
            soldiers[i] = TotalSoldiers(mat[i]);
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            int minIdx = 0;
            for(int j=0; j<soldiers.length; j++) {
                if(soldiers[j]<soldiers[minIdx]) {
                    minIdx = j;
                }
            }
            res[i] = minIdx;
            soldiers[minIdx] = Integer.MAX_VALUE;
        }
        return res;
        
    }
    public int TotalSoldiers(int[] arr) {
        int lo = 0;
        int hi = arr.length;
        
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == 1) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
