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
        ListNode left, right, temp, tempLeft, tempRight;
        temp = head;
        tempLeft = left = new ListNode(0);
        tempRight = right = new ListNode(0);
        while(temp != null) {
            if(temp.val < x) {
                left.next = new ListNode(temp.val);
                left = left.next;
            } else {
                right.next = new ListNode(temp.val);
                right = right.next;
            }
            temp = temp.next;
        }
        left.next = tempRight.next;
        head = tempLeft.next;
        return head;
    }
}
