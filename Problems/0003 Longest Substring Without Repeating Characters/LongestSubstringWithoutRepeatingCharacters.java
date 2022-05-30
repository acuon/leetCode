//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        for(char ch: s.toCharArray()) {
            if(list.indexOf(ch)!=-1) {
                while(list.get(0) != ch) {
                    list.remove(0);
                }
                list.remove(0);
            }
            list.add(ch);
            max = Math.max(max, list.size());
        }
        return max;
    }
}
