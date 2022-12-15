//https://leetcode.com/problems/longest-common-subsequence/

class Solution {
    private Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new Integer[text1.length()][text2.length()];
        return check(text1, text2, text1.length()-1, text2.length()-1);
    }
    private int check(String a, String b, int i, int j) {
        if(i == -1 || j == -1) {
            return 0;
        }
        if(dp[i][j] != null) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) {
            dp[i][j] = 1 + check(a, b, i-1, j-1);
            return dp[i][j];
        }
        int first = check(a, b, i-1, j);
        int second = check(a, b, i, j-1);
        dp[i][j] = Math.max(first, second);
        return dp[i][j];
    }
}
