//https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer idx;
        for(int i=0; i<nums.length; i++) {
            idx = map.put(nums[i], i); // returns previous stored value
            if(idx != null && Math.abs(idx-i) <= k ) return true;
            
        }
        return false;
    }
}
