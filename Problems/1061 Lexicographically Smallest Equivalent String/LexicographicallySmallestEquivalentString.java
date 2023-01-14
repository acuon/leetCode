//https://leetcode.com/problems/lexicographically-smallest-equivalent-string/description/

class Solution {
    private int[] arr;
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        arr = new int[26];
        for(int i=0; i<26; i++) arr[i] = i;
        for(int i=0; i<s1.length(); i++) {
            int ch1 = s1.charAt(i) - 'a';
            int ch2 = s2.charAt(i) - 'a';
            int i1 = getSmallest(ch1);
            int i2 = getSmallest(ch2);
            if(i1 < i2) {
                arr[ch2] = i1;
                arr[i2] = i1;
            } else {
                arr[ch1] = i2;
                arr[i1] = i2;
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch: baseStr.toCharArray()) {
            int idx = getSmallest(ch-'a');
            res.append((char)(idx+'a'));
        }
        return res.toString();
    }
    private int getSmallest(int ch) {
        if(arr[ch] == ch) return ch;
        return getSmallest(arr[ch]);
    }
}
