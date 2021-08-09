/*
//https://leetcode.com/problems/palindrome-number/

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Example 4:

Input: x = -101
Output: false

 

Constraints:

    -2^31 <= x <= 2^31 - 1


*/


//using StringBuilder
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if(x!=0 && x%10==0) return false;
        StringBuilder str = new StringBuilder(Integer.toString(x));
        StringBuilder st = new StringBuilder(Integer.toString(x));
        str.reverse();
        //System.out.println(str+" "+st);
        return st.toString().equals(str.toString());
    }
}


//using while loop
class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int b = 0;
        while(x>0) {
            b = b*10 + x%10;
            x/=10;
        }
        return a==b;
    }
}
