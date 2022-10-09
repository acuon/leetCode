//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> map = new HashSet<>();
        return helper(root, k, map);
    }
    private boolean helper(TreeNode root, int k, HashSet<Integer> map) {
        if(root == null) return false;
        if(map.contains(k - root.val)) {
            return true;
        }
        map.add(root.val);
        return helper(root.left, k, map) || helper(root.right, k, map);
    }
}
