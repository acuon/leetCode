//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/

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
    public int longestZigZag(TreeNode root) {
        helper(root, false, 0);
        return max;
    }
    private void helper(TreeNode root, boolean isRight, int current) {
        max = Math.max(max, current);
        if(root.left != null) {
            helper(root.left, false, isRight?(current+1):1);
        }
        if(root.right != null) {
            helper(root.right, true, isRight?1:(current+1));
        }
    }
}
