//https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(carry>0 || l1!=null || l2!=null) {
            if(l1!=null && l2!=null) {
                carry += l1.val + l2.val;
                head.next = new ListNode(carry%10);
                carry /= 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1!=null) {
                carry += l1.val;
                head.next = new ListNode(carry%10);
                carry /= 10;
                l1 = l1.next;
            } else if(l2!=null) {
                carry += l2.val;
                head.next = new ListNode(carry%10);
                l2 = l2.next;
                carry /= 10;
            } else if(carry>0) {
                head.next = new ListNode(carry%10);
                carry /= 10;
            }
            head = head.next;
        }
        return ans.next;
    }
}
