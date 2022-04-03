//https://leetcode.com/problems/reverse-string-ii/

class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        while(i<n) {
            if(i+k-1 < n) {
                j = i+k-1;
            } else {
                j = n-1;
            }
            swap(arr, i, j);
            i += 2*k;
        }
        return String.valueOf(arr);
    }
    public void swap(char[] arr, int i, int j) {
        while(i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
