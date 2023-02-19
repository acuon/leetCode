//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

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
    private List<List<Integer>> ans;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans = new ArrayList<>();
        traverse(root, 0);
        for(int i=1; i<ans.size(); i+=2) {
            reverse(ans.get(i));
        }
        return ans;
    }
    private void reverse(List<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        while(i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
    private void traverse(TreeNode root, int level) {
        if(root == null) return;
        if(level >= ans.size()) ans.add(new ArrayList<Integer>());
        ans.get(level).add(root.val);
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }
}
