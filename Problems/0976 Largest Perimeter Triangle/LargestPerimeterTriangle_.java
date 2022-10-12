//https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        moveMaxToLast(nums, n-1);
        moveMaxToLast(nums, n-2);
        moveMaxToLast(nums, n-3);
        for(int i=n-3; i>=0; i--) {
            if((nums[i] + nums[i+1]) > nums[i+2]) {
                return nums[i] + nums[i+1] + nums[i+2];
            } else {
                if(i>0) moveMaxToLast(nums, i-1);
            }
        }
        return 0;
    }
    private void moveMaxToLast(int[] arr, int idx) {
        int max = arr[0];
        int index = 0;
        for(int i=0; i<=idx; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        int temp = arr[index];
        arr[index] = arr[idx];
        arr[idx] = temp;
    }
}
