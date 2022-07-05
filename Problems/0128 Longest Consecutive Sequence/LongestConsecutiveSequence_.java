//https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int longest = 0;
        for(int n: nums) {
            que.add(n);
        }
        int num = Integer.MIN_VALUE;
        int len = 1;
        while(que.size()>0) {
            if(que.peek() == num-1) {
                que.poll();
                continue;
            } else if(que.peek() == num) {
                len++;
                que.poll();
            } else {
                num = que.poll();
                len = 1;
            }
            num++;
            longest = Math.max(longest, len);
        }
        return longest;
    }
}
