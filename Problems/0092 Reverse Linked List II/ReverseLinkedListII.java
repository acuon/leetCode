//https://leetcode.com/problems/reverse-linked-list-ii/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //first part
        ListNode cur1 = dummy;
        ListNode pre1 = null;
        for(int i=0; i<left; i++){
            pre1 = cur1;
            cur1 = cur1.next;
        }
        
        //reverse
        ListNode cur2 = cur1;
        ListNode pre2 = pre1;
        ListNode q2;
        for(int i=left; i<=right; i++){
            q2 = cur2.next;
            cur2.next = pre2;
            pre2 = cur2;
            cur2 = q2;
        }
        
        //connect 
        pre1.next = pre2;
        cur1.next = cur2;
        
        return dummy.next;
    }
}
