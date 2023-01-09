//https://leetcode.com/problems/binary-tree-postorder-traversal/description/

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        traverse(postOrder, root);
        return postOrder;
    }
    private void traverse(List<Integer> list, TreeNode root) {
        if(root == null) return;
        if(root.left != null) traverse(list, root.left);
        if(root.right != null) traverse(list, root.right);
        list.add(root.val);
    }
}
