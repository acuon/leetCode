//https://leetcode.com/problems/longest-common-prefix/submissions/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        String first = strs[0];
        for(int i=0; i<first.length(); i++) {
            char ch = first.charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch) {
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }
}
