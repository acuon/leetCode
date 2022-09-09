//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/

class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr, (a, b) -> (a[0] == b[0]) ? (b[1] - a[1]) : (a[0] - b[0]));
        int count = 0;
        int n = arr.length;
        int max = arr[n - 1][1];
        for (int i = n - 1; i >= 0; i--) {
            if (max > arr[i][1]) {
                count++;
            } else {
                max = arr[i][1];
            }
        }
        return count;
    }
}
