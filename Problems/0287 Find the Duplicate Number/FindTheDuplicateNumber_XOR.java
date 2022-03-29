//https://leetcode.com/problems/find-the-duplicate-number/submissions/

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            int xor = nums[i-1] ^ nums[i];
            if(xor == 0) {
                return nums[i];
            }
        }
        return -1;
    }
}
