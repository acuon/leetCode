//https://leetcode.com/problems/word-pattern/description/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Set<String> set = new HashSet<>();
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        for(int i=0; i<arr.length; i++) {
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)) {
                if(set.contains(arr[i])) return false;
                map.put(ch, arr[i]);
                set.add(arr[i]);
            } else {
                if(!map.get(ch).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
