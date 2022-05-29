//https://leetcode.com/problems/maximum-product-of-word-lengths/

class Solution {
    public int maxProduct(String[] words) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<words.length; i++) {
            String str1 = words[i];
            int[] word1 = new int[26];
            for(char ch: str1.toCharArray()) {
                word1[ch-'a']++;
            }
            for(int j=i+1; j<words.length; j++) {
                String str2 = words[j];
                int len = str1.length()*str2.length();
                if(len>max && contains(word1, words[j])) {
                    max = len;
                }
            }
        }
        if(max == Integer.MIN_VALUE) max = 0;
        return max;
    }
    public static boolean contains(int[] arr, String str) {
        for(char ch: str.toCharArray()) {
            if(arr[ch-'a']!=0) return false;
        }
        return true;
    }
}
