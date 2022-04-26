//https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1;
        int high = x;
        while(true) {
            int mid = low + (high-low)/2;
            if(mid > x/mid) {
                high = mid;
            } else {
                if((mid+1) > x/(mid+1)) {
                    return mid;
                } else {
                    low = mid+1;
                }
            }
        }
    }
}
