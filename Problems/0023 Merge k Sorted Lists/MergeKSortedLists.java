//https://leetcode.com/problems/merge-k-sorted-lists/

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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int i=0; i<lists.length; i++){
            add(lists[i],list);
        }
        ListNode res = new ListNode(0);
        ListNode head = res;
        while(list.size()>0) {
            res.next = new ListNode(list.poll());
            res = res.next;
        }
        return head.next; 
    }
    public void add(ListNode head, PriorityQueue<Integer> list){
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
    }
}
