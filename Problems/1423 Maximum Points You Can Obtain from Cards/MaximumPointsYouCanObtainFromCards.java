//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int sum = 0;
        int n = cardPoints.length;
        for(int i=0; i<k; i++) {
            sum += cardPoints[i];
        }
        max = Math.max(max, sum);
        int i = k-1;
        int j = n-1;
        while(j >= n-k && i >= 0) {
            sum -= cardPoints[i];
            sum += cardPoints[j];
            max = Math.max(max, sum);
            i--;
            j--;
        }
        return max;
    }
}
