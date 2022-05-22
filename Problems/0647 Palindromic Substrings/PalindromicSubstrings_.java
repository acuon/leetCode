//https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        count+=n;
        for(int i=0; i<n; i++) {
            for(int j=i+2; j<=n; j++) {
                // System.out.println(s.substring(i, j));
                if(isPalindrome(s.substring(i, j))) count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}
