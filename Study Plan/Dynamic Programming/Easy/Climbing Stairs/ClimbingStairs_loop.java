//https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0) {
            int temp = b;
            b += a;
            a = temp;
        }
        return a;
    }
}
