//https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/

class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int rounds = 0;
        for(int i=0; i<tasks.length;) {
            int j = i;
            while(j<tasks.length && tasks[i] == tasks[j]) j++;
            int count = j-i;
            if(count == 1) return -1;
            else if(count%3 == 0) rounds += count/3;
            else rounds += count/3 + 1;
            i = j;
        }
        return rounds;
    }
}
