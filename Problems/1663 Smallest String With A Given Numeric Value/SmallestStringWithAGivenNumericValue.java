//https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        for(int i=0; i<n; i++) {
            arr[i] = 'a';
        }
        k-=n;
        n--;
        while(k>0) {
            arr[n--] += Math.min(25, k);
            k-=Math.min(25, k);
        }
        return String.valueOf(arr);
    }
}
