//https://leetcode.com/problems/binary-tree-pruning/

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
    public TreeNode pruneTree(TreeNode root) {
        boolean bool = helper(root);
        if(!bool) return null;
        return root;
    }
    public boolean helper(TreeNode root) {
        if(root == null) return false;
        boolean left = helper(root.left);
        boolean right = helper(root.right);
        boolean isOne = root.val == 1;
        if(!left) root.left = null;
        if(!right) root.right = null;
        return left || right || isOne;
    }
}
