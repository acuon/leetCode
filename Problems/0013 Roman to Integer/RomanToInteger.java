//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int[] arr = new int[s.length()];
        //MCMXCIV
        //1000 + (1000-100 = 900) + (100-10 = 90) + 4
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if(ch=='I') {
                arr[i] = 1;
            } else if(ch=='V') {
                arr[i] = 5;
            } else if(ch=='X') {
                arr[i] = 10;
            } else if(ch=='L') {
                arr[i] = 50;
            } else if(ch=='C') {
                arr[i] = 100;
            } else if(ch=='D') {
                arr[i] = 500;
            } else if(ch=='M') {
                arr[i] = 1000;
            }
        }
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]<arr[i+1]) {
                num-=arr[i];
            } else {
                num+=arr[i];
            }
        }
        num += arr[arr.length-1];
        return num;
    }
}
