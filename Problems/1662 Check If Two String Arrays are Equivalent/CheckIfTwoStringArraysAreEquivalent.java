//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return string(word1).equals(string(word2));
    }
    public static String string(String[] ar) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<ar.length; i++) {
            str.append(ar[i]);
        }
        return str.toString();
    }
}
