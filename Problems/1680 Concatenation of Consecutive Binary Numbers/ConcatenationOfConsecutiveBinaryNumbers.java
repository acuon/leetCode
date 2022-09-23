//https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/

class Solution {
    //not done by me - Amit😀 solution
    public int concatenatedBinary(int n) {
        long mod = (long) Math.pow(10, 9) + 7;
        int length = 0;
        long sum = 0;
        for (int i=1; i<=n; i++) {
            if ((i & (i-1)) == 0) {
                length++;
            }
            sum <<= length;
            sum += i;
            if (sum > mod) {
                sum %= mod;
            }
        }
        return (int) (sum % mod);        
    }
}
