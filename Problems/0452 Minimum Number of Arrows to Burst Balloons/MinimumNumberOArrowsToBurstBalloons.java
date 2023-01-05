//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, myComparator);
        int n = points.length;
        int prev = points[0][1];
        int arrows = 1;
        for(int i=1; i<n; i++) {
            if(prev >= points[i][0]) continue;
            arrows++;
            prev = points[i][1];
        }
        return arrows;
    }
    private Comparator<int[]> myComparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
        }
    };
}
