//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int a = 0;
        int b = height.length-1;
        int max = 0;
        int leftmax = 0;
        int rightmax = 0;
        while(a <= b){
            leftmax = Math.max(leftmax, height[a]);
            rightmax = Math.max(rightmax, height[b]);
            if(leftmax < rightmax){
                max += (leftmax - height[a]);
                a++;
            }
            else{
                max += (rightmax - height[b]);
                b--;
            }
        }
        return max;
    }
}
