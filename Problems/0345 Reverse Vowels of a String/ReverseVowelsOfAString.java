//https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i<j) {
            while(i<j) {
                if(isVowel(arr[i])) {
                    break;
                }
                i++;
            }
            while(i<j) {
                if(isVowel(arr[j])) {
                    break;
                }
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
    private boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
