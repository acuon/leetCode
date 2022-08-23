//https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode jum = head;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(jum!= null && jum.next != null){
            jum = jum.next.next;
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            if(jum!=null && jum.next == null) current = current.next;
        }
        while(prev != null && current != null){
            if(prev.val != current.val) return false;
            prev = prev.next;
            current = current.next;
        }
        
        if(prev != null || current != null) return false;
        return true;
    }
}
