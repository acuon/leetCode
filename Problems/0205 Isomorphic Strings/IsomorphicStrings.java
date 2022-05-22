//https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] first = new int[127];
        int[] second = new int[127];
        for(int i=0; i<s.length(); i++) {
            //storing the previous index
            if(first[s.charAt(i)] != second[t.charAt(i)]) return false;
            first[s.charAt(i)] = i+1;
            second[t.charAt(i)] = i+1;
        }
        return true;
    }
}
