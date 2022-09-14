//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/

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
    private int count = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();
    public int pseudoPalindromicPaths (TreeNode root) {
        countPalindromes(root);
        return count;
    }
    public void countPalindromes(TreeNode root) {
        boolean used = false;
        if(map.containsKey(root.val)) {
            map.remove(root.val);
        } else {
            used = true;
            map.put(root.val, 1);
        }
        if(root.left != null) countPalindromes(root.left);
        if(root.right != null) countPalindromes(root.right);
        if(root.left == null && root.right == null) {
            if(map.size() <= 1) count++;
        }
        if(used) {
            map.remove(root.val);
        } else {
            map.put(root.val, 1);
        }
    }
}
