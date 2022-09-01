//https://leetcode.com/problems/count-good-nodes-in-binary-tree/

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
    public int goodNodes(TreeNode root) {
        return getGoodNodes(root, Integer.MIN_VALUE);
    }
    public int getGoodNodes(TreeNode root, int max) {
        if(root == null) return 0;
        int count = 0;
        if(root.val >= max) {
            max = root.val;
            count++;
        }
        count += getGoodNodes(root.left, max);
        count += getGoodNodes(root.right, max);
        return count;
    }
}
