//https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        int max = num;
        int dif = 3;
        String s = Integer.toString(num);
        for(int i=s.length()-1; i>=0 ;i--) {
            int temp = 0;
            if(s.charAt(i)=='9') {
                temp = num - dif;
            } else {
                temp = num + dif;
            }
            dif = dif*10;
            max = Math.max(temp,max);
        }
        return max;
    }
}
