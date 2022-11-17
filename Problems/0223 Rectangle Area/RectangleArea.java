//https://leetcode.com/problems/rectangle-area/

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1 = (ax2-ax1)*(ay2-ay1);
        int rect2 = (bx2-bx1)*(by2-by1);
        
        int x1 = Math.max(ax1, bx1);
        int y1 = Math.max(ay1, by1);
        int x2 = Math.min(ax2, bx2);
        int y2 = Math.min(ay2, by2);
        
        int x = x2-x1;
        int y = y2-y1;
        int intersection = x*y;
        
        if(x<0 || y<0) {
            intersection = 0;
        }
        return rect1 + rect2 - intersection;
    }
}
