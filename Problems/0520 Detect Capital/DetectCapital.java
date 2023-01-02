//https://leetcode.com/problems/detect-capital/description/

class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        int small = 0;
        int n = word.length();
        boolean first = false;
        for(int i=0; i<n; i++) {
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 90) {
                if(i == 0) first = true;
                caps++;
            }
            if(ch >= 97 && ch <= 122) {
                small++;
            }
        }
        if(caps == n || small == n || (first && caps == 1)) return true;
        return false;
    }
}

//using regex
class Solution {
    private String regex = "[A-Z]+|[a-z]+|[A-Z][a-z]+";
    public boolean detectCapitalUse(String word) {
        return word.matches(regex);
    }
}
