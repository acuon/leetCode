//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        // return the element which repeats more than n/2 times
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
