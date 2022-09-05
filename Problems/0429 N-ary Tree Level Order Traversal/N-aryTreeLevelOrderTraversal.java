//https://leetcode.com/problems/n-ary-tree-level-order-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) return arr;
        arr.add(new ArrayList<Integer>());
        arr.get(0).add(root.val);
        helper(root.children, arr, 1);
        return arr;
    }
    private void helper(List<Node> root, List<List<Integer>> arr, int lvl) {
        if(root == null) return;
        for(Node node: root) {
            if(lvl >= arr.size()) {
                arr.add(new ArrayList<Integer>());
            }
            arr.get(lvl).add(node.val);
            helper(node.children, arr, lvl+1);
        }
    } 
}
