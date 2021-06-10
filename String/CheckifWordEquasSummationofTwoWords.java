/*
//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/


The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

    For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.

You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.

 

Example 1:

Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
Output: true
Explanation:
The numerical value of firstWord is "acb" -> "021" -> 21.
The numerical value of secondWord is "cba" -> "210" -> 210.
The numerical value of targetWord is "cdb" -> "231" -> 231.
We return true because 21 + 210 == 231.

Example 2:

Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
Output: false
Explanation: 
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aab" -> "001" -> 1.
We return false because 0 + 0 != 1.

Example 3:

Input: firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
Output: true
Explanation: 
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aaaa" -> "0000" -> 0.
We return true because 0 + 0 == 0.

 

Constraints:

    1 <= firstWord.length, secondWord.length, targetWord.length <= 8
    firstWord, secondWord, and targetWord consist of lowercase English letters from 'a' to 'j' inclusive.

*/


//0ms approach
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return charToint(firstWord) + charToint(secondWord) == charToint(targetWord);
    }
    public int charToint(String s) {
        int no = 0;
        char[] str = s.toCharArray();
        for(char ch:str) {
            no *= 10;
            no += ch - 'a';
        }
        return no;
    }
}


//6ms approach | Brute force
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String str = "abcdefghij";
        int first = 0, second = 0, target = 0;
        for(int i=0; i<str.length(); i++) {
            String temp_string = "", temp_num = "";
            temp_string += str.charAt(i);
            temp_num += i;
            if(firstWord.contains(temp_string)) {
                firstWord = firstWord.replace(temp_string,temp_num);
            }
            if(secondWord.contains(temp_string)) {
                secondWord = secondWord.replace(temp_string,temp_num);
            }
            if(targetWord.contains(temp_string)) {
                targetWord = targetWord.replace(temp_string,temp_num);
            }
        }
        first = Integer.parseInt(firstWord);
        second = Integer.parseInt(secondWord);
        target = Integer.parseInt(targetWord);
        if(first+second==target) {
            return true;
        }
        else return false;
    }
}
