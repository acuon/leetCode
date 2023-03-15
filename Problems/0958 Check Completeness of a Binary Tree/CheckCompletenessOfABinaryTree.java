//https://leetcode.com/problems/check-completeness-of-a-binary-tree/

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
    private List<List<Integer>> nodes;
    private boolean ans = true;
    public boolean isCompleteTree(TreeNode root) {
        nodes = new ArrayList();
        map(root, true, 0);
        if(ans) check();
        return ans;
    }
    private void check() {
        for(int i=0; i<nodes.size(); i++) {
            boolean met = false;
            for(int j=0; j<nodes.get(i).size(); j++) {
                if(i == nodes.size() - 1) {
                    if(met && nodes.get(i).get(j) != -1) {
                        ans = false;
                        return;
                    }
                    if(nodes.get(i).get(j) == -1) met = true;
                } else {
                    if(nodes.get(i).get(j) == -1) {
                        ans = false;
                        return;
                    }
                }
            }
        }
    }
    private void map(TreeNode root, boolean add, int level) {
        if(root == null) {
            if(level < nodes.size()) {
                nodes.get(level).add(-1);
            }
            return;
        }
        boolean bool = false;
        if(nodes.size() <= level) {
            if(add) {
                bool = true;
                nodes.add(new ArrayList<Integer>());
            } else {
                ans = false;
                return;
            }
        }
        nodes.get(level).add(root.val);
        map(root.left, bool, level+1);
        map(root.right, false, level+1);
    }
}
