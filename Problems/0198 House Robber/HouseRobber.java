//https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {
        int even = 0;
        int odd = 0;
        int[] dp = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                even = Math.max(odd, even + nums[i]);
            } else {
                odd = Math.max(even, odd + nums[i]);
            }
        }
        return Math.max(even, odd);
    }
}
