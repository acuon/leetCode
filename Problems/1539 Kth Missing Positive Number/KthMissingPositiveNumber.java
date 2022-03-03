//https://leetcode.com/problems/kth-missing-positive-number/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i: arr) {
            if(i<=k) k++;
            else break;
        }
        return k;
    }
}
