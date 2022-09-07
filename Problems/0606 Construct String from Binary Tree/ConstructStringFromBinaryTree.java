//https://leetcode.com/problems/construct-string-from-binary-tree/

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
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        helper(root, str);
        return str.toString();
    }
    private void helper(TreeNode root, StringBuilder str) {
        if(root.left == null && root.right == null) {
            str.append(root.val);
            return;
        }
        str.append(root.val);
        if(root.left != null) {
            str.append("(");
            helper(root.left, str);
            str.append(")");
        } else if(root.right != null) {
            str.append("()");
        }
        if(root.right != null) {
            str.append("(");
            helper(root.right, str);
            str.append(")");
        }
    }
}
