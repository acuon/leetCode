//https://leetcode.com/problems/reordered-power-of-2/

class Solution {
    public boolean reorderedPowerOf2(int num) {
        int[] numArr = toIntArr(num);
        for(int i=0; i<=30; i++) {
            int power = 1<<i;
            int[] powerArr = toIntArr(power);
            if(isEqual(numArr, powerArr)) return true;
        }
        return false;
    }
    public static int[] toIntArr(int n) {
        int[] arr = new int[10];
        while (n>0) {
            arr[n%10]++;
            n/=10;
        }
        return arr;
    }
    public static boolean isEqual(int[] numArr, int[] powerArr) {
        return Arrays.equals(numArr, powerArr);
    }
}
