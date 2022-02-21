//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        // return the element which repeats more than n/2 times
        int mElement = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++) {
            if(mElement == nums[i]) {
                count++;
            } else if(count == 0) {
                count++;
                mElement = nums[i];
            } else {
                count--;
            }
        }
        return mElement;
    }
}
