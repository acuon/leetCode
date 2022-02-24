//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) {
                System.out.println(i+" "+Character.toLowerCase(s.charAt(i)));
                System.out.println(j+" "+Character.toLowerCase(s.charAt(j)));
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
