//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        //MCMXCIV
        //1000 + (1000-100 = 900) + (100-10 = 90) + 4
        for(int i=0; i<s.length()-1; i++) {
            int cur = val(s.charAt(i));
            int next = val(s.charAt(i+1));
            if(cur < next) {
                num -= cur;
            } else {
                num += cur;
            }
        }
        num += val(s.charAt(s.length()-1));
        return num;
    }
    public int val(char ch) {
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else return 1000;
    }
}
