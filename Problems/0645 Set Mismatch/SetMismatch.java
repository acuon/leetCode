//https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int missing = 0;
        int duplicate = 0;
        for(int i=0; i<n; i++) {
            arr[nums[i]-1]++;
        }
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                missing = i+1;
            }
            if(arr[i] == 2) {
                duplicate = i+1;
            }
        }
        return new int[] {duplicate, missing};
    }
}
