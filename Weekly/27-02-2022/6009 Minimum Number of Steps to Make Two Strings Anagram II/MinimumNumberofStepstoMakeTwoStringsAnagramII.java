//https://leetcode.com/contest/weekly-contest-282/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii/

class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            arr[t.charAt(i)-'a']--;
        }
        for(int i: arr) {
            count += Math.abs(i);
        }
        return count;
    }
}
