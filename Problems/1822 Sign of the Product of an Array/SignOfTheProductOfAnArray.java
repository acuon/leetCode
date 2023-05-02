//https://leetcode.com/problems/sign-of-the-product-of-an-array/description/

class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;
        for(int num: nums) {
            if(num < 0) negative++;
            if(num == 0) return 0;
        }
        return (negative%2 == 0)? 1: -1;
    }
}
