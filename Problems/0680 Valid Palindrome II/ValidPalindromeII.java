//https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0; 
        int j=arr.length-1;
        while(i<j) {
            if(arr[i]!=arr[j]) {
                return (isPalindrome(arr, i, j-1) || isPalindrome(arr, i+1, j));
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(char[] arr, int i, int j) {
        while(i<j) {
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
