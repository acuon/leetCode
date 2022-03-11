//https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        int len = 0;
        ListNode temp = head;
        while(temp!=null) {
            temp = temp.next;
            len++;
        }
        k%=len;
        if(k==0) return head;
        int rotate = len-k;
        temp = head;
        while(rotate>1) {
            temp = temp.next;
            rotate--;
        }
        ListNode tempHead = temp.next;
        temp.next = null;
        temp = tempHead;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = head;
        return tempHead;
    }
}
