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
        ListNode res = head;
        int len =0;
        while(res!=null){
            res = res.next;
            len++;
        }
        int nth = len - n;
        res = head;
        if(nth == 0) return head.next;
        // System.out.println(nth);
        while(res != null){
            nth--;
            if(nth == 0 && res.next.next != null) res.next = res.next.next;
            else if(nth == 0) res.next = null;
            res = res.next;
        }
        return head;
    }
}
