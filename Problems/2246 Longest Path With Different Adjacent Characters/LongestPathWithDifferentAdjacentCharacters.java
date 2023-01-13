//https://leetcode.com/problems/longest-path-with-different-adjacent-characters/description/

class Solution {
    private int maxLen = 0;
    private Map<Integer, ArrayList<Integer>> map;
    public int longestPath(int[] parent, String s) {
        map = new HashMap<>();
        for(int i=1; i<parent.length; i++) {
            if(s.charAt(i) != s.charAt(parent[i])) {
                ArrayList<Integer> temp = map.getOrDefault(parent[i], new ArrayList<Integer>());
                temp.add(i);
                map.put(parent[i], temp);
            }
        }
        for(int i=0; i<parent.length; i++) {
            if(parent[i] != i) dfs(i, parent);
        }
        return maxLen;
    }
    private int dfs(int n, int[] parent) {
        parent[n] = n;
        int max1 = 0;
        int max2 = 0;
        if(map.containsKey(n)) {
            for(int i: map.get(n)) {
                int child = dfs(i, parent);
                if(child > max1) {
                    max2 = max1;
                    max1 = child;
                } else if(child > max2) {
                    max2 = child;
                }
            }
        }
        int len = 1 + (max1 + max2);
        int childMax = 1 + max1;
        maxLen = Math.max(maxLen, Math.max(childMax, len));
        return childMax;
    }
}
