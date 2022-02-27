//https://leetcode.com/contest/weekly-contest-282/problems/counting-words-with-a-given-prefix/

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String str: words) {
            if(str.indexOf(pref) == 0) count++;
        }
        return count;
    }
}
