/*
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/


Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

 

Constraints:

    1 <= word1.length, word2.length <= 10^3
    1 <= word1[i].length, word2[i].length <= 10^3
    1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3
    word1[i] and word2[i] consist of lowercase letters.

*/


//Logic is same in both approach, but using Stringbuilder the program takes less time
//Using StringBuilder
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


//Using String
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return string(word1).equals(string(word2));
    }
    public static String string(String[] ar) {
        String str = "";
        for(int i=0; i<ar.length; i++) {
            str += ar[i];
        }
        return str;
    }
}

