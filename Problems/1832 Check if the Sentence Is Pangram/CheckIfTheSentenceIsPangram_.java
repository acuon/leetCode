//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String str) {
        if(str.length() < 26) return false;
        int[] arr = new int[26];
        for(char ch: str.toCharArray()) {
            arr[ch-'a']++;
        }
        for(int i: arr) {
            if(i == 0) return false;
        }
        return true;
    }
}
