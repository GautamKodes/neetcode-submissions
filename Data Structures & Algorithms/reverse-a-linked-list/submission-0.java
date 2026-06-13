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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode nextNode = null;
        while(head != null){
            ListNode firstNode = head;
            nextNode = head.next;
            firstNode.next = previous;
            previous = firstNode;
            head = nextNode;
        }
        return previous;
        
    }
}
