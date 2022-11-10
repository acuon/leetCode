//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int j = 0;
        for(int i=0; i<s.length(); i++) {
            if(j > 0 && arr[j-1] == s.charAt(i)) {
                j--;
            } else {
                arr[j] = s.charAt(i);
                j++;
            }
        }
        return new String(arr, 0, j);
    }
}
