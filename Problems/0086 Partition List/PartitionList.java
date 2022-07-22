//https://leetcode.com/problems/partition-list/

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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyL = new ListNode(0);
        ListNode low = dummyL;
        ListNode dummyH = new ListNode(0);
        ListNode high = dummyH;
        while(head != null) {
            if(head.val < x) {
                low.next = new ListNode(head.val);
                low = low.next;
            } else {
                high.next = new ListNode(head.val);
                high = high.next;
            }
            head = head.next;
        }
        low.next = dummyH.next;
        return dummyL.next;
    }
}
