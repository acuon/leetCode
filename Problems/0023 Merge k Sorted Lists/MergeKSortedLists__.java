//https://leetcode.com/problems/merge-k-sorted-lists/submissions/

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
        ListNode head = new ListNode(0);
        ListNode res = head;
        boolean check = true;
        while(check){
            boolean check2 = true;
            int ind = -1;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<lists.length; i++){
              if(lists[i] != null){
                  check2 = false;
                  if(lists[i].val < min){
                      min = lists[i].val;
                      ind = i;
                  }
              }
            }   
            if(check2){
                check = false;
                break;
            }
            res.next = new ListNode(min);
            res = res.next;
            lists[ind] = lists[ind].next;
        }
        return head.next;
    }
}
