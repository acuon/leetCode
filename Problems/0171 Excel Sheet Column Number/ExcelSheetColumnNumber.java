//https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i=0; i<columnTitle.length(); i++) {
            sum *= 26;
            sum += (columnTitle.charAt(i)-'A'+1);
        }
        return sum;
    }
}
