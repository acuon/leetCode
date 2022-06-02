//https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        double ans = power(x, Math.abs(n));
        if(n<0) {
            return 1/ans;
        }
        return ans;
    }
    public double power(double x, int n) {
        if(n==0) return 1.0;
        if(n==1) return x;
        if(n%2==0) {
            return power(x*x, n/2);
        }
        return x*power(x*x, n/2);
    }
}
