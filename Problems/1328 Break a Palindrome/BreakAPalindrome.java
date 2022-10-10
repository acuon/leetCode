//https://leetcode.com/problems/break-a-palindrome/

class Solution {
    public String breakPalindrome(String str) {
        if(str.length() == 1) return "";
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            if(arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n-1] = 'b';
        return String.valueOf(arr);
    }
}
