//https://leetcode.com/problems/mirror-reflection/

class Solution {
    public int mirrorReflection(int p, int q) {
        int distance = q;
        int reflection = 0;
        int trip = 0;
        while(distance%p != 0) {
            reflection++;
            distance += q;
        }
        trip = distance/p;
        if(trip%2==1) {
            if(reflection%2==1) return 2;
            return 1;
        }
        return 0;
    }
}
