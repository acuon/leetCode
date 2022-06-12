//https://leetcode.com/problems/maximum-erasure-value/

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Queue<Integer> que = new LinkedList<>();
        int max = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(que.contains(nums[i])) {
                while(que.peek()!=nums[i]){
                    sum -= que.poll();
                }
                sum -= que.poll();
            }
            que.add(nums[i]);
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
