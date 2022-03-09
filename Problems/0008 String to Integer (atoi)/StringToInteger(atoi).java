//https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s == null || s.length() == 0) return 0;
        int n = s.length();
        int sign = 1;
        int sum = 0;
        int idx = 0;
        if(s.charAt(0) == '-') {
            sign = -1;
            idx++;
        } else if(s.charAt(0) == '+') {
            sign = 1;
            idx++;
        }
        for(;idx<n; idx++) {
            int ch = s.charAt(idx)-'0';
            if(ch<0 || ch>9) {
                return sum*sign;
            }
            if(sum>Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && Integer.MAX_VALUE%10<ch)) {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            sum = sum * 10  + ch;
        }
        return (int)sum*sign;
    }
}
