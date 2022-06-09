//https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int low = 1;
        int high = num/2;
        while(low<=high) {
            //even if the current mid is not the answer, the square of mid can be out of int range
            long mid = low + (high-low)/2;
            if(mid*mid == num) {
                return true;
            } else if(mid*mid < num) {
                low = (int)(mid+1);
            } else {
                high = (int)(mid-1);
            }
        }
        return false;
    }
}
