//https://leetcode.com/problems/gas-station/description/

class Solution {
    // not my solution
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int curTank = 0;
        int start = 0;
        int n = gas.length;
        for(int i=0; i<n; i++) {
            tank += gas[i] - cost[i];
            curTank += gas[i] - cost[i];
            if(curTank < 0) {
                start = i+1;
                curTank = 0;
            }
        }
        if(tank >= 0) return start;
        return -1;
    }
}
