//https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder();
        ans.append(1);
        for(int i=1; i<n; i++) {
            ans = say(ans);
        }
        return ans.toString();
    }
    private StringBuilder say(StringBuilder str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=1; i<=str.length(); i++) {
            if(i == str.length()) {
                ans.append(count).append(str.charAt(i-1));
            } else {
                if(str.charAt(i) != str.charAt(i-1)) {
                    ans.append(count).append(str.charAt(i-1));
                    count = 1;
                } else {
                    count++;
                }
            }
        }
        return ans;
    }
}
