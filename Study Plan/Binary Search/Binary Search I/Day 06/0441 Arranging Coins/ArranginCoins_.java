//https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        while(low<=high) {
            long mid = low + (high - low)/2;
            long used = (mid*(mid+1))/2;
            if(used == n) {
                return (int)mid;
            }
            if(used > n) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return (int)high;
    }
}
