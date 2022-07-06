//https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int a = 0;
        int b = 1;
        int count = 1;
        while(count < n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        return b;
    }
}
