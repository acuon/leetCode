//https://leetcode.com/problems/jump-game-vi/

class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> s = new LinkedList<>();
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        s.offer(1);
        for(int i = 2; i <= nums.length; i++) {
            dp[i] = nums[i-1] + dp[s.peekFirst()];
            
            while(!s.isEmpty() && dp[s.peekLast()] < dp[i])
                s.pollLast();
            
            s.offer(i);
            
            if(i > k) {
                if(s.peekFirst() == i-k) s.pollFirst();
            }
        }
        
        return dp[nums.length];
    }
}
