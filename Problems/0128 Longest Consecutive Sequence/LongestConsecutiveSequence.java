//https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int n: nums) {
            set.add(n);
        }
        int num = 0;
        for(int n: set) {
            if(!set.contains(n-1)) {
                num = n+1;
                while(set.contains(num)) {
                    num++;
                }
                longest = Math.max(longest, num-n);
            }
        }
        return longest;
    }
}
