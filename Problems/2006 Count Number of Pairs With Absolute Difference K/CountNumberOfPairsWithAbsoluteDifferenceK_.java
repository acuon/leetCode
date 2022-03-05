//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] arr = new int[101];
        int count = 0;
        for(int i: nums) {
            arr[i]++;
        }
        for(int i=0; i+k<101; i++) {
            count += arr[i]*arr[i+k];
        }
        return count;
    }
}
