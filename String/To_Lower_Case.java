/*
//https://leetcode.com/problems/to-lower-case/

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter. 

Example 1:

Input: s = "Hello"
Output: "hello"

Example 2:

Input: s = "here"
Output: "here"

Example 3:

Input: s = "LOVELY"
Output: "lovely"

 

Constraints:

    1 <= s.length <= 100
    s consists of printable ASCII characters.
*/

//using in-Built function
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

//using ASCII 
class Solution {
    public String toLowerCase(String s) {
        char[] ar = s.toCharArray();
        for(int i=0; i<ar.length; i++) {
            if(ar[i]>=65 && ar[i]<=90) {
                ar[i] = (char)(ar[i]+32);
            }
        }
        return new String(ar);
    }
}
