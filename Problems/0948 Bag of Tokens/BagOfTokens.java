//https://leetcode.com/problems/bag-of-tokens/

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int start = 0;
        int end = n - 1;
        int score = 0;
        int maxScore = 0;
        while (start <= end) {
            if (power >= tokens[start]) {
                power -= tokens[start++];
                score++;
                maxScore = Math.max(score, maxScore);
            } else if (score >= 1) {
                power += tokens[end--];
                score--;
            } else {
                break;
            }
        }
        return maxScore;
    }
}
