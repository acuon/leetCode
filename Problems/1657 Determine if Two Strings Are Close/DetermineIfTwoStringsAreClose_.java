//https://leetcode.com/problems/determine-if-two-strings-are-close/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int[] arr = new int[26];
        for(int i=0; i<word1.length(); i++) {
            arr[word1.charAt(i)-'a']++;
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for(int i=0; i<word2.length(); i++) {
            arr[word2.charAt(i)-'a']++;
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        int count = 0;
        for(int i: arr) if(i!=0) count++;
        List<Integer> set1 = new ArrayList<>(map1.values().stream().toList());
        List<Integer> set2 = new ArrayList<>(map2.values().stream().toList());
        Collections.sort(set1);
        Collections.sort(set2);
        return set1.equals(set2) && (count == set1.size());
    }
}
