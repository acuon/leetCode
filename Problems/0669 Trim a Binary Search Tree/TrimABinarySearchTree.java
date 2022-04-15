//https://leetcode.com/problems/trim-a-binary-search-tree/submissions/

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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return root;
        while(root!=null && (root.val < low || root.val > high)) {
            if(root.val < low) {
                root = root.right;
            }
            if(root.val > high) {
                root = root.left;
            }
        }
        // trimming left side
        TreeNode temp = root;
        while(temp!=null) {
            while(temp.left!=null && temp.left.val<low) {
                temp.left = temp.left.right;
            }
            temp = temp.left;
        }
        //trimming right side
        temp = root;
        while(temp!=null) {
            while(temp.right!=null && temp.right.val>high) {
                temp.right = temp.right.left;
            }
            temp = temp.right;
        }
        return root;
    }
}
