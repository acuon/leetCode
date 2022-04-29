//https://leetcode.com/problems/number-of-1-bits/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
            count+=(n&1);
            n=n>>>1;//shifting the last bit
        }
        return count;
    }
}
