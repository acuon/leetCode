//https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        else if(n==0) return false;
        while(true) {
            if(n%4 != 0) break;
            n /= 4;
        }
        return n == 1;
    }
}
