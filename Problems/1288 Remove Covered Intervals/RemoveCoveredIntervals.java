//https://leetcode.com/problems/remove-covered-intervals/

class Solution {
    public int lengthOfLastWord(String s) {
        // String[] ar = s.split(" ");
        // return ar[ar.length-1].length();
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
