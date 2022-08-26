//https://leetcode.com/problems/reordered-power-of-2/

class Solution {
    public boolean reorderedPowerOf2(int num) {
        var numArr = String.valueOf(num).toCharArray();
        Arrays.sort(numArr);
        for(int i=0; i<=30; i++) {
            int power = 1<<i;
            if(isEqual(numArr, power)) return true;
        }
        return false;
    }
    public static boolean isEqual(char[] numArr, int power) {
        var powerArr = String.valueOf(power).toCharArray();
        Arrays.sort(powerArr);
        return Arrays.equals(numArr, powerArr);
    }
}
