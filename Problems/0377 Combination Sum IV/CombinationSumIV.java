//https://leetcode.com/problems/combination-sum-iv/

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return recurse(nums, target, memo);
    }
    
    public int recurse(int[] nums, int remain, int[] memo){
        if(remain < 0) return 0;
        if(memo[remain] != -1) return memo[remain];
        if(remain == 0) return 1;
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += recurse(nums, remain - nums[i], memo);
        }
        
        memo[remain] = ans;
        return memo[remain];
    }
}
