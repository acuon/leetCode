/*
//https://leetcode.com/problems/middle-of-the-linked-list/

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 
Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Constraints:
    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100

*/

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

//first approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null) {
            temp = temp.next;
            size++;
        }
        int mid = size/2;
        
        ListNode midNode = head;
        while(mid!=0) {
            midNode = midNode.next;
            mid--;
        }
        return midNode;
    }
}


//another approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode midHead = head;
        while(temp!=null && temp.next!=null) {
            midHead = midHead.next;
            temp = temp.next.next;
        }
        return midHead;
    }
}
