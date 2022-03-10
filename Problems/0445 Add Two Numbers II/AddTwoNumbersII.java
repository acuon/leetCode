//https://leetcode.com/problems/add-two-numbers-ii/

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
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode temp = new ListNode(0);
        int sum = 0;
        for(; l1!=null; l1 = l1.next) {
            s1.push(l1.val);
        }
        for(; l2!=null; l2 = l2.next) {
            s2.push(l2.val);
        }
        while(!s1.isEmpty() || !s2.isEmpty()) {
            if(!s1.isEmpty()) {
                sum += s1.pop();
            }
            if(!s2.isEmpty()) {
                sum += s2.pop();
            }
            temp.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = temp;
            temp = head;
            sum /= 10;
        }
        return temp.val==0?temp.next:temp;
    }
}
