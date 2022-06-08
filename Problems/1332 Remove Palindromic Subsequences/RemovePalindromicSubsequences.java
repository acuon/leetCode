//https://leetcode.com/problems/remove-palindromic-subsequences/
//https://leetcode.com/problems/remove-palindromic-subsequences/discuss/2125596/Easy-Solution-with-Explanation

class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0) return 0;
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) return 2;
        }
        return 1;
    }
}
//it says subsequence not substring
//lets suppose the string is aaaba
// then we can remove aaaa subsequence in first move
// and b in second move
