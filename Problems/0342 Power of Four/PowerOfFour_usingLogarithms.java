//https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPowerOfFour(int n) {
        //logarithmic formula
        //a^b = c -> log(c)/log(a) = b
        double num = Math.log(n)/Math.log(4);
        return num == (int)num;
    }
}
