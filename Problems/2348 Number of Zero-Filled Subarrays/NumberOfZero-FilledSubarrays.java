//https://leetcode.com/problems/number-of-zero-filled-subarrays/description/

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long subArrays = 0;
        long count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            subArrays += count;
        }
        return subArrays;
    }
}
