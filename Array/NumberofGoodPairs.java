/*
//https://leetcode.com/problems/number-of-good-pairs/

Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:

Input: nums = [1,2,3]
Output: 0

 

Constraints:

    1 <= nums.length <= 100
    1 <= nums[i] <= 100
*/

//Method 1
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=1, j=0; i<nums.length; i++) {
            if(nums[i-1]==nums[i]) {
                count += 1 + j++;
            }
            else j = 0;
        }
        return count;
    }
}


//Method 2
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if(nums[i]==nums[j] && i<j && i!=j) {
                    count++;
                    if(count>max) {
                        max=count;
                    }
                }
            }
        }
        return max;
    }
}
