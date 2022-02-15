//https://leetcode.com/problems/sort-even-and-odd-indices-independently/

//using in place swapping
// 8ms Runtime
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(i%2==0 && j%2==0) {
                    if(nums[i]>nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                } else if(i%2==1 && j%2==1) {
                    if(nums[i]<nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
                
            }
        }
        return nums;
    }
}
