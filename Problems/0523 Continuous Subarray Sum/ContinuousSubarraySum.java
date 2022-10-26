//https://leetcode.com/problems/continuous-subarray-sum/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(Map.of(0,-1));
        for(int i=0;i< nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum % k)) 
            {
                if(map.get(sum % k) < i-1) return true;
            }
            else map.put(sum % k, i);
        }
        return false;
    }
}
