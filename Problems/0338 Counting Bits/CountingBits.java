//https://leetcode.com/problems/counting-bits/

class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int pow = 1;
        int t = 0;
        for(int i=1; i<=n; i++, t++) {
            if(i==pow) {
                pow *= 2;
                t = 0;
            }
            arr[i] = arr[t] + 1;
        }
        return arr;
    }
}
