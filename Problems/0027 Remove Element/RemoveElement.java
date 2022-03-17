//https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int idx = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                len--;
                if(idx==-1) idx = i;
            } else if(idx!=-1 && nums[i]!=val) {
                nums[idx++] = nums[i];
            }
        }
        return len;
    }
}
