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
    private int[] arr = new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
        countPalindromes(root);
        return count;
    }
    public void countPalindromes(TreeNode root) {
        arr[root.val] = arr[root.val] + 1;
        if(root.left != null) countPalindromes(root.left);
        if(root.right != null) countPalindromes(root.right);
        if(root.left == null && root.right == null) {
            if(canBePalindrome()) count++;
        }
        arr[root.val] = arr[root.val] - 1;
    }
    public boolean canBePalindrome() {
        int odd = 0;
        for(int i: arr) {
            if(i%2==1) odd++;
        }
        return odd <= 1;
    }
}
