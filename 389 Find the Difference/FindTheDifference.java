//https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(char ch: t.toCharArray()) {
            sum += (int)ch;
        }
        for(char ch: s.toCharArray()) {
            sum -= (int)ch;
        }
        return (char)sum;
    }
}
