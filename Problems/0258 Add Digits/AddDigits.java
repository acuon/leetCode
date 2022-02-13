//https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        while(num>9) {
            num = digitAdd(num);
        }
        return num;
    }
    public int digitAdd(int num) {
        int sum = 0;
        while(num>0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}
