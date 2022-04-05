//https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int area = 0;
        while(s<e) {
            area = Math.max(area, Math.min(height[s], height[e])*(e-s));
            if(height[s]<height[e]) {
                s++;
            } else {
                e--;
            }
        }
        return area;
    }
}
