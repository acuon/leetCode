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
    private Map<Integer, List<Node>> map;
    public Node connect(Node root) {
        map = new HashMap<>();
        mapNodes(root, 0);
        pointNodes();
        return root;
    }
    private void mapNodes(Node root, int level) {
        if(root == null) return;
        List<Node> temp;
        if(map.containsKey(level)) {
            temp = map.get(level);
        } else {
            temp = new ArrayList<>();
        }
        temp.add(root);
        map.put(level, temp);
        if(root.left != null) mapNodes(root.left, level+1);
        if(root.right != null) mapNodes(root.right, level+1);
    }
    private void pointNodes() {
        for(Map.Entry<Integer, List<Node>> entry: map.entrySet()) {
            List<Node> arr = entry.getValue();
            for(int i=1; i<arr.size(); i++) {
                arr.get(i-1).next = arr.get(i);
            }
        }
    }
}
