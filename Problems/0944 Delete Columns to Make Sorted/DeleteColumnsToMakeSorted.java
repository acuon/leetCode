//https://leetcode.com/problems/delete-columns-to-make-sorted/description/

class Solution {
    public int minDeletionSize(String[] strs) {
        int m = strs[0].length();
        int count = 0;
        for(int i=0; i<m; i++) {
            if(!check(strs, i)) {
                count++;
            }
        }
        return count;
    }
    private boolean check(String[] arr, int j) {
        char prev = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].charAt(j) < prev) return false;
            prev = arr[i].charAt(j);
        }
        return true;
    }
}
