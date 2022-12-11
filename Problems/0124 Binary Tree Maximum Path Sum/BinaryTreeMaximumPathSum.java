//https://leetcode.com/problems/binary-tree-maximum-path-sum/

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
    private int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {        
        maxTreePath(root);
        return maxPathSum;
    }

    private int maxTreePath(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(maxTreePath(node.left), 0);
        int right = Math.max(maxTreePath(node.right), 0);
        int pathSum = node.val + left + right;
        maxPathSum = Math.max(pathSum, maxPathSum);
        return node.val + Math.max(left, right);
    }
}
