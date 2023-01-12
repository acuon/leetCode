//https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/description/

class Solution {
    int ans[];
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ans = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(0 , -1 , adj , labels);
        return ans;
    }
    private int[] dfs(int curr , int prev , List<List<Integer>> adj , String labels){
        int freq[] = new int[26];
        for(Integer nbr : adj.get(curr)){
            if(nbr != prev){
                int temp_freq[] = dfs(nbr , curr , adj , labels);
                for(int i = 0;i < temp_freq.length;i++){
                    freq[i] += temp_freq[i];
                }
            }
        }
        ans[curr] = ++freq[labels.charAt(curr) - 'a'];
        return freq;
    }
}
