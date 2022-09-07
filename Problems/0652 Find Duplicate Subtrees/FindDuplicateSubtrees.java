//https://leetcode.com/problems/find-duplicate-subtrees/

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
    private HashMap<String, TreeNode> map = new HashMap<>();
    private HashMap<String, Integer> count = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root);
        for(Map.Entry<String, TreeNode> entry: map.entrySet()) {
            if(count.get(entry.getKey()) >= 2) {
                list.add(entry.getValue());
            }
        }
        return list;
    }
    private String helper(TreeNode root) {
        if(root == null) return "";
        StringBuilder str = new StringBuilder();
        str.append("(")
            .append(helper(root.left))
            .append(root.val)
            .append(helper(root.right))
            .append(")");
        String current = str.toString();
        if(map.containsKey(current)) {
            count.put(current, count.get(current)+1);
        } else {
            map.put(current, root);
            count.put(current, 1);
        }
        return current;
    }
}
