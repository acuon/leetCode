//https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int n: nums) {
            set.add(n);
        }
        for(int n: set) {
            if(!set.contains(n-1)) {
                int m = n+1;
                while(set.contains(m)) {
                    m++;
                }
                longest = Math.max(longest, m-n);
            }
        }
        return longest;
    }
}
