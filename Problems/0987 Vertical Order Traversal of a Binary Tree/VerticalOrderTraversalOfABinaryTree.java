//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        Map<Integer, Map<Integer,List<Integer>>> store = new TreeMap<>();
        
        solve(store,root,0,0);
        
        // Creating the resultant list using the maps structure 
        // along with sorting of the list of the nodes that have same row and column
        for(Integer key : store.keySet()){
            Map<Integer,List<Integer>> map = store.get(key);
            List<Integer> sub = new ArrayList<>();
            for(Integer mK : map.keySet()){
                List<Integer> e = map.get(mK);
                Collections.sort(e);
                sub.addAll(e);
            }
            res.add(sub);
        }
        
        return res;
    }
    
    private void solve(Map<Integer, Map<Integer,List<Integer>>> store, TreeNode root, int level, int hLevel){
        if(root == null) return;
        
        // Get the inner map from the outer map using vertical level
        Map<Integer,List<Integer>> map = (store.containsKey(level)) ? store.get(level) : new TreeMap<>();
        
        // Get the list of nodes from the inner map using horizontal level
        List<Integer> value = (map.containsKey(hLevel)) ? map.get(hLevel) : new ArrayList<>();

        // Add node in the list of nodes and update the list in the inner map and then
        // update the inner map in the outer map
        value.add(root.val);
        map.put(hLevel,value);
        store.put(level,map);
        
        // Call for left and right subtrees 
        solve(store,root.left,level-1,hLevel+1);
        solve(store,root.right,level+1,hLevel+1);    }
}
