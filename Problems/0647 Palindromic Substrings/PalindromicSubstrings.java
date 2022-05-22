//https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int count = 0;
    public int countSubstrings(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        for(int i=0; i<n; i++) {
            palindromes(ch, i, i);
            palindromes(ch, i, i+1);
        }
        return count;
    }
    public void palindromes(char[] ch, int i, int j) {
        while(i>=0 && j<ch.length && ch[i]==ch[j]) {
            i--;
            j++;
            count++;
        }
    }
}
