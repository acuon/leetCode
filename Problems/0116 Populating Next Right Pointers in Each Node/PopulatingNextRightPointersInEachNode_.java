//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private Node[] arr = new Node[100];
    public Node connect(Node root) {
        mapNodes(root, 0);
        return root;
    }
    private void mapNodes(Node root, int level) {
        if(root == null) return;
        if(arr[level] != null) {
            arr[level].next = root;
        }
        arr[level] = root;
        if(root.left != null) mapNodes(root.left, level+1);
        if(root.right != null) mapNodes(root.right, level+1);
    }
}
