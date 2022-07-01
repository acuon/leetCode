//https://leetcode.com/problems/maximum-units-on-a-truck/submissions/

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1]-a[1]));
        int max = 0;
        for(int i=0; i<boxTypes.length && truckSize>0; i++) {
            if(truckSize >= boxTypes[i][0]) {
                max += boxTypes[i][0]*boxTypes[i][1];
            } else {
                max += truckSize*boxTypes[i][1];
            }
            truckSize -= boxTypes[i][0];
        }
        return max;
    }
}
