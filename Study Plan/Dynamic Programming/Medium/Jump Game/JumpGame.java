//https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        for(int jump=0; i<nums.length && i<=jump; i++) {
            jump = Math.max(i+nums[i], jump);
            System.out.println(jump);
        }
        return i==nums.length;
    }
}
