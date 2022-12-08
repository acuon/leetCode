//https://leetcode.com/problems/leaf-similar-trees/

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getLeafs(list1, root1);
        getLeafs(list2, root2);
        return list1.equals(list2);
    }
    private void getLeafs(List<Integer> list, TreeNode root) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
        }
        if(root.left != null) {
            getLeafs(list, root.left);
        }
        if(root.right != null) {
            getLeafs(list, root.right);
        }
    }
}
