//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null || cloned.val == target.val) {
            return cloned;
        }
        TreeNode temp = getTargetCopy(original.left, cloned.left, target);
        if(temp == null) temp = getTargetCopy(original.right, cloned.right, target);
        return temp;
    }
}
