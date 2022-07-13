//https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    List<List<Integer>> arr;
    public List<List<Integer>> levelOrder(TreeNode root) {
        arr = new ArrayList<>();
        helper(root, 0);
        return arr;
    }
    public void helper(TreeNode root, int index) {
        if(root == null) return;
        if(arr.size() == index) {
            arr.add(new ArrayList<Integer>());
        }
        arr.get(index).add(root.val);
        helper(root.left, index+1);
        helper(root.right, index+1);
    }
}
