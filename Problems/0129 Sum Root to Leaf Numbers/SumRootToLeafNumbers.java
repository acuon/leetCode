//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

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
    private int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        sumNumbers(root, 0);
        return sum;
    }
    private void sumNumbers(TreeNode root, int num) {
        int curr = num*10 + root.val;
        if(root.left == null && root.right == null) {
            sum += curr;
            return;
        }
        if(root.left != null) sumNumbers(root.left, curr);
        if(root.right != null) sumNumbers(root.right, curr);
    }
}
