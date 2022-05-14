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
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            add(lists[i],list);
        }
        Collections.sort(list);
        ListNode res = new ListNode(0);
        ListNode head = res;
        for(int i=0; i<list.size(); i++){
            res.next = new ListNode(list.get(i));
            res = res.next;
        }
        return head.next; 
    }
    public void add(ListNode head, ArrayList<Integer> list){
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
    }
}
