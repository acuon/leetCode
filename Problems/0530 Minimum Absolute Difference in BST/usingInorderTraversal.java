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
    private List<Integer> arr = new ArrayList<>();
    private int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        for(int i=1; i<arr.size(); i++) {
            min = Math.min(min, arr.get(i) - arr.get(i-1));
        }
        return min;
    }
    public void inorderTraversal(TreeNode root) {
        if(root == null) return;
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
    }
}
