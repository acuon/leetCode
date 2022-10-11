//https://leetcode.com/problems/increasing-triplet-subsequence/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int low = Integer.MAX_VALUE;
        int sLow = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num <= low) {
                low = num;
            } else if(num <= sLow) {
                sLow = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
