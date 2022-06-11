//https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/

class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, total = 0;
        for(int i: nums) total += i;
        total -= x;
        if(total == 0) return n;
        int size = -1;
        int s = 0, e = 0, curr = 0;
        while(e < n) {
            curr += nums[e++];
            while(s < n && curr > total) {
                curr -= nums[s++];
            }
            if(curr == total) {
                size = Math.max(size, (e - s));
            }
        }
        return size == -1 ? -1 : n - size;
    }
}
