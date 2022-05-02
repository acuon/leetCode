//https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ar = new int[nums.length];
        int j = 0, n = nums.length-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
                ar[j] = nums[i];
                j++;
            } else {
                ar[n] = nums[i];
                n--;
            }
        }
        return ar;
    }
}
