//https://leetcode.com/problems/zigzag-conversion/submissions/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        char[] ch = s.toCharArray();
        int idx = 0;
        int n = 0;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++) sb[i] = new StringBuffer();
        while(idx<s.length()) {
            while(idx<s.length() && n<numRows) {
                sb[n].append(ch[idx++]);
                n++;
            }
            n=numRows-2;
            while(idx<s.length() && n>=0) {
                sb[n].append(ch[idx++]);
                n--;
            }
            n+=2;
        }
        // for(int i=0; i<sb.length; i++) {
        //     System.out.println(sb[i].toString());
        // }
        for(int i=1; i<sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
