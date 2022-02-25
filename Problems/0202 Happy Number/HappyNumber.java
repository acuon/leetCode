//https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            if(n==1) return true;
            set.add(n);
            n = squareSum(n);
        }
        return false;
    }
    public int squareSum(int n) {
        int sum = 0;
        while(n>0) {
            sum += square(n%10);
            n /= 10;
        }
        return sum;
    }
    public int square(int n) {
        return (int)Math.pow(n, 2);
    }
}
