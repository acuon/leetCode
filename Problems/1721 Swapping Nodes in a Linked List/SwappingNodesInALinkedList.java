//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = null, second = null;
        ListNode temp = head;
        while(temp!=null) {
            if(second!=null) {
                second = second.next;
            }
            if(k==1) {
                first = temp;
                second = head;
            }
            temp = temp.next;
            k--;
        }
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;
        return head;
    }
}
