//https://leetcode.com/problems/determine-if-string-halves-are-alike/

class Solution {
    public boolean halvesAreAlike(String s) {
        int first = 0;
        int second = 0;
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(isVowel(s.charAt(i))) {
                first++;
            }
            if(isVowel(s.charAt(n/2 + i))) {
                second++;
            }
        }
        return first == second;
    }
    private boolean isVowel(char ch) {
        return switch(ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
