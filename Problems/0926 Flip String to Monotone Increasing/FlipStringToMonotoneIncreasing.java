//https://leetcode.com/problems/flip-string-to-monotone-increasing/description/

class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones = 0;
        int flips = 0;
        for(char ch: s.toCharArray()) {
            if(ch == '1') ones++;
            if(ch == '0' && ones > 0) flips++;
            if(ones < flips) flips = ones;
        }
        return flips;
    }
}
