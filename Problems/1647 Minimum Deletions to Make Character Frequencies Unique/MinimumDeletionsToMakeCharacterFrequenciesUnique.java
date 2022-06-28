//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        for(char ch: s.toCharArray()) {
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int keep = arr[25];
        int prev = keep;
        for(int i=24; i>=0 && arr[i]!=0 && prev!=0; i--) {
            prev = Math.min(arr[i], prev-1);
            keep += prev;
        }
        return s.length()-keep;
    }
}
