//https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        int i = 0;
        char[] arr = s.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == ' ') {
                reverse(arr, i, j - 1);
                i = j + 1;
            } else if (j == arr.length - 1)  {
                reverse(arr, i, j);
            }
        }
        return new String(arr);
    }
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
