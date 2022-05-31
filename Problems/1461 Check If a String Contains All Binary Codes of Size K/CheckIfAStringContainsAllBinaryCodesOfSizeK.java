//https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/

class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=k; i<=s.length(); i++) {
            set.add(s.substring(i-k, i));
        }
//         return set.size() == Math.pow(2, k);
        return set.size() == 1<<k;
    }
}
