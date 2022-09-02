//https://leetcode.com/problems/average-of-levels-in-binary-tree/

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
    private List<List<Integer>> list = new ArrayList();
    public List<Double> averageOfLevels(TreeNode root) {
        getAvgList(root, 0);
        List<Double> avg = new ArrayList();
        for(int i=0; i<list.size(); i++) {
            double average = getAverage(list.get(i));
            avg.add(average);
        }
        return avg;
    }
    private void getAvgList(TreeNode root, int level) {
        if(root == null) return;
        if(level >= list.size()) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        getAvgList(root.left, level+1);
        getAvgList(root.right, level+1);
    }
    private double getAverage(List<Integer> arr) {
        long sum = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return (double) sum/arr.size();
    }
}
