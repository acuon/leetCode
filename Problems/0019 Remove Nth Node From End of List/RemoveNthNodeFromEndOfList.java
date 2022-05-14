//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int len = 0;
        while(head!=null) {
            len++;
            head = head.next;
        }
        int i = 0;
        head = temp;
        while(i<len-n) {
            i++;
            head = head.next;
        }
        head.next = head.next.next;
        return temp.next;
    }
}
