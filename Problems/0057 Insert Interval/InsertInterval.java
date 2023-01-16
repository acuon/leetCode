//https://leetcode.com/problems/insert-interval/description/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while(i < n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        while(i < n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }
        list.add(newInterval);
        while(i < n){
            list.add(intervals[i]);
            i++;
        }
        int[][] ans = new int[list.size()][2];
        i = 0;
        for(int[] interval: list) {
            ans[i++] = interval;
        }
        return ans;
    }
}
