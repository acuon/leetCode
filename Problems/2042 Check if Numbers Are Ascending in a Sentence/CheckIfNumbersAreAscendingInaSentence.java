//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/

class Solution {
    public boolean areNumbersAscending(String s) {
        int i = 0;
        int curr = 0;
        int prev = 0;
        while(i<s.length()) {
            int temp = s.charAt(i)-'0';
            if(temp>=0 && temp<=9) {
                curr = curr * 10 + temp;
            } else if(curr != 0) {
                if(prev >= curr) return false;
                prev = curr;
                curr = 0;
            }
            i++;
        }
        if(curr!=0 && prev>=curr) return false; 
        return true;
    }
}
