//https://leetcode.com/problems/max-points-on-a-line/description/

class Solution {
    public int maxPoints(int[][] points) {
        int max = 0;
        int n = points.length;
        for(int i=0; i<n; i++) {
            int[] x = points[i];
            Map<Double,Integer> map = new HashMap<>();
            for(int j=0; j<n; j++) {
                int[] y = points[j];
                if(x == y) continue;
                double slope = 0;
                if(y[0]-x[0] == 0) {
                    slope = Double.POSITIVE_INFINITY; 
                } else {
                    slope = getSlope(x, y);
                }
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max+1;
    }
    private double getSlope(int[] x, int[] y) {
        return (y[1]-x[1])/(double)(y[0]-x[0]);
    }
}
