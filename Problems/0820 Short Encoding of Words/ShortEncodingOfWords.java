//https://leetcode.com/problems/short-encoding-of-words/

class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<>(Arrays.asList(words));
        for (String w : words) {
            for(int i=1; i<w.length(); i++) {
                s.remove(w.substring(i));
            }
        }
        int res = s.size(); //for extra #
        for (String w : s) res += w.length();
        return res;
    }
}
