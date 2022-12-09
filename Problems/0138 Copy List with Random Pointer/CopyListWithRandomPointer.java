//https://leetcode.com/problems/copy-list-with-random-pointer/description/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        // System.out.println(map);
        temp = head;
        Node copy = new Node(0);
        Node copyHead = copy;
        while(temp != null) {
            copy.next = map.get(temp);
            if(temp.random != null) {
                copy.next.random = map.get(temp.random);
            }
            temp = temp.next;
            copy = copy.next;
        }
        return copyHead.next;
    }
}
