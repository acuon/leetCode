//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(i<2 || nums[i]>nums[count-2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
