//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

//Solution 1
class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;
        int n = s.length();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(isVowel(s.charAt(i))) count++;
            arr[i] = count;
        }
        max = arr[k-1];
        for(int i=k; i<n; i++) {
            max = Math.max(max, arr[i] - arr[i-k]);
        }
        return max;
    }
    private boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}


//Solution 2
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++) {
            if(i >= k) {
                if(isVowel(s.charAt(i-k))) count--;
            }
            if(isVowel(s.charAt(i))) count++;
            max = Math.max(count, max);
        }
        return max;
    }
    private boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
