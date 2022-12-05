//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp != null) {
            temp = temp.next;
            n++;
        }
        n/=2;
        temp = head;
        while(n-- > 0) {
            temp = temp.next;
        }
        return temp;
    }
}
