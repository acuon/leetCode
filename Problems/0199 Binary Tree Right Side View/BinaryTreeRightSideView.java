//https://leetcode.com/problems/binary-tree-right-side-view/

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
    public List<Integer> arr;
    public List<Integer> rightSideView(TreeNode root) {
        arr = new ArrayList<>();
        rightSideView(root, 0);
        return arr;
    }
    public void rightSideView(TreeNode root, int level) {
        if(root == null) return;
        if(level == arr.size()) {
            arr.add(root.val);
        }
        rightSideView(root.right, level+1);
        rightSideView(root.left, level+1);
    }
}
