//https://leetcode.com/problems/minimum-average-difference/

class Solution {
    public int minimumAverageDifference(int[] nums) {
        long rightSum = 0;
        long leftSum = 0;
        int minIdx = 0;
        int minDiff = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i: nums) rightSum += i;
        for(int i=0; i<nums.length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i];
            int diff = (int)Math.abs((leftSum/(i+1)) - ((rightSum == 0) ? 0 : (rightSum/(n-i-1))));
            if(diff < minDiff) {
                minDiff = diff;
                minIdx = i;
            }
        }
        return minIdx;
    }
}
