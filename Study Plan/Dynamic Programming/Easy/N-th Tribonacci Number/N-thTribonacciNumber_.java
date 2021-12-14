//https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    public int tribonacci(int n) {
        if(n < 2) return n;
        else if(n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int count = 2;
        while(count < n){
            int temp = c;
            c = a + b + c;
            a = b;
            b = temp;
            count++;
        }
        return c;
    }
}
