/*
//https://leetcode.com/problems/split-a-string-in-balanced-strings/

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Example 4:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'

 

Constraints:

    1 <= s.length <= 1000
    s[i] is either 'L' or 'R'.
    s is a balanced string.


*/



class Solution {
    public int balancedStringSplit(String s) {
        int L_count = 0;
        int R_count = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'L') {
                L_count++;
            } else if (s.charAt(i) == 'R') {
                R_count++;
            }
            if(L_count == R_count) {
                count++;
            }
        }
        return count;
    }
}



/*

//this program cannot be used for above conditions


class Solution {
    public boolean isEqual(String str) {
        boolean b = false;
        if(str.length()%2==0) {
            int n = str.length()/2;
            int count_first = 1;
            int count_second = 1;
            int j = n*2;
            for(int i=0; i<n-1; i++) {
                if(str.length()>2 && str.charAt(i) == str.charAt(i+1)) {
                    count_first++;
                }
                if(str.length()>2 && str.charAt(j) == str.charAt(j-1)) {
                    count_second++;
                }
                j--;
            }
            if(count_first == count_second) {
                b = true;
            }
        }
        return b;
    }
    public int balancedStringSplit(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if((s.charAt(i)=='L' && s.charAt(j)=='R') || (s.charAt(i)=='R' && s.charAt(j)=='L')) {
                    String temp_string = s.substring(i,j+1);
                    System.out.print(temp_string+" ");
                    if(isEqual(temp_string)) {
                        count++;
                        System.out.print("i am in ");
                    }
                }
            }
        }
        return count;
    }
}
*/

