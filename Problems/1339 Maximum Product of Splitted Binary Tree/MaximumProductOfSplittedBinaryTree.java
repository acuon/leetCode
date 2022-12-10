//https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/

class Solution {
    private long max = 0;
    private int totalSum = 0; 
    private long mod = 1000000007;
    
    public int maxProduct(TreeNode root) {
        totalSum = totalSum(root);
        helper(root);
        return (int)(max % mod);
    }

    private int totalSum(TreeNode root) {
        int sum = root.val;
        if(root.left != null) sum += totalSum(root.left);
        if(root.right != null) sum += totalSum(root.right);
        return sum;
    }

    private int helper(TreeNode root) {
        int sum = root.val;
        if(root.left != null) sum += helper(root.left);
        if(root.right != null) sum += helper(root.right);
        long prod = (long) sum * (totalSum - sum);
        max = Math.max(max, prod);
        return sum;
    }
}
