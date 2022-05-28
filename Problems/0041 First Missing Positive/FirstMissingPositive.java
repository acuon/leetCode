//https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int num: nums) {
            if(num>=0 && num<=nums.length) {
                arr[num]++;
            }
        }
        int i = 1;
        for(; i<arr.length; i++) {
            if(arr[i]==0) {
                return i;
            }
        }
        return i;
    }
}
