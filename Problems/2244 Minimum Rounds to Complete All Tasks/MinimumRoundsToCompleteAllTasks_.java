//https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/

class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: tasks) map.put(i, map.getOrDefault(i, 0) + 1);
        int rounds = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int count = entry.getValue();
            if(count == 1) return -1;
            else {
                rounds += (count/3);
                if(count%3 != 0) rounds++;
            }
        }
        return rounds;
    }
}
