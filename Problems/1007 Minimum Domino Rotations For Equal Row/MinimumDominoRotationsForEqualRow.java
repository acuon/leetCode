//https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] t = new int[7];
        int[] b = new int[7];
        int[] same = new int[7];
        int n = tops.length;
        for(int i=0; i<n; i++) {
            t[tops[i]]++;
            b[bottoms[i]]++;
            if(tops[i]==bottoms[i]) {
                same[tops[i]]++;
            }
        }
        for(int i=0; i<7; i++) {
            if((t[i]+b[i]-same[i]) == n) {
                return n-Math.max(t[i], b[i]);
            }
        }
        return -1;
    }
}
