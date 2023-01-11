//https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] edge: edges) {
            if(map.containsKey(edge[1])) {
                map.put(edge[0], edge[1]);
            } else {
                map.put(edge[1], edge[0]);
            }
        }
        // System.out.println(map);
        int result = 0;
        for(int i=0; i<hasApple.size(); i++) {
            if(!hasApple.get(i)) continue;
            int p = i;
            while(p != 0 && map.get(p) >= 0) {
                int temp = map.get(p);
                map.put(p, -1);
                p = temp;
                result++;
            }
        }
        return result*2;
    }
}
