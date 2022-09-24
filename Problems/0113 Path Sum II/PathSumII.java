//https://leetcode.com/problems/path-sum-ii/

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
    private List<Integer> list = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, targetSum, res);
        return res;
    }
    
    private void helper(TreeNode root, int target, List<List<Integer>> res) {
        if(root == null) return;
        list.add(root.val);
        target -= root.val;
        if(root.left == null && root.right == null && target == 0) {
            res.add(new ArrayList<>(list));
        } else {
            helper(root.left, target, res);
            helper(root.right, target, res);
        }
        list.remove(list.size() - 1);
    }
}
