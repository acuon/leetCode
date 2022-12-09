//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/

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
    private int max = 0;
    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return max;
    }
    private void helper(TreeNode root, int low, int high) {
        int newHigh = Math.max(high, root.val);
        int newLow = Math.min(low, root.val);
        max = Math.max(max, newHigh - newLow);
        if(root.left != null) helper(root.left, newLow, newHigh);
        if(root.right != null) helper(root.right, newLow, newHigh);
    }
}
