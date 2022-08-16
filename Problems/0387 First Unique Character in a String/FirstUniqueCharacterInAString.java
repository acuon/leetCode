//https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        char[] charr = s.toCharArray();
        for(char ch: charr) {
            arr[ch-'a']++;
        }
        int idx = 0;
        for(char ch: charr) {
            if(arr[ch-'a'] == 1) return idx;
            idx++;
        }
        return -1;
    }
}
