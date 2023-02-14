//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

class Solution {
    public int countOdds(int low, int high) {
        if(low%2 == 1) low--;
        if(high%2 == 1) high++;
        return (high-low)/2;
    }
}
