//https://leetcode.com/problems/delete-columns-to-make-sorted/description/

class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;
        for(int i=0; i<m; i++) {
            boolean flag = true;
            for(int j=1; j<n && flag; j++) {
                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    flag = false;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}
