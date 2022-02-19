//https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int min = 0;
        String sub = "";
        for(int i=0; i<s.length(); i++) {
            for(int j=s.length()-1; j>=i; j--) {
                if(min>j-i) break;
                // 0 1 2 3 4
                if(s.charAt(i) == s.charAt(j) && isPalindrome(s, i, j)) {
                    min = j-i;
                    if((j-i+1)>max) {
                        max = j-i+1;
                        sub = s.substring(i, j+1);
                    }
                }
            }
        }
        return sub;
    }
    public boolean isPalindrome(String str, int i, int j) {
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
