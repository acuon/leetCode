//https://leetcode.com/problems/count-sorted-vowel-strings/

class Solution {
    public int countVowelStrings(int n) {
        int[] countOfEach = new int[] { 1, 1, 1, 1, 1 };
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < countOfEach.length; j++) {
                countOfEach[j] = countOfEach[j - 1] + countOfEach[j];
             }  
        }
        // print(countOfEach);
        return sum(countOfEach);
    }
    private void print(int[] arr) {
        for(int i: arr) System.out.print(i+" ");
    }
    private int sum(int[] arr) {
        int amount = 0;
        for (int num : arr) {
            amount += num;
        }
        return amount;
    }
}
