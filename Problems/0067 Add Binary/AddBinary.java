//https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum = 0;
        while(i>=0 || j>=0) {
            sum = carry;
            if(i>=0) sum += a.charAt(i)-'0';
            if(j>=0) sum += b.charAt(j)-'0';
            res.insert(0, sum%2);
            carry = sum>>1;
            i--;
            j--;
        }
        if(carry!=0) res.insert(0, carry);
        return res.toString();
    }
}
