//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String str) {
        if(str.length() < 26) return false;
        for(int i=0; i<26; i++) {
            if(str.indexOf((char)('a'+i)) == -1) return false; 
        }
        return true;
    }
}
