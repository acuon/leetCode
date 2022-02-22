//https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int pow = 0;
        for(int i=columnTitle.length()-1; i>=0; i--) {
            sum += (columnTitle.charAt(i)-'A'+1)*Math.pow(26, pow++);
        }
        return sum;
    }
}
