//https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int duplicate = 0;
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            sum += nums[i];
            if(arr[nums[i]-1] == -1) {
                duplicate = nums[i];
            }
            arr[nums[i]-1] = -1;
        }
        int missing = ((n*(n+1))/2) - (sum - duplicate);
        return new int[] {duplicate, missing};
    }
}
