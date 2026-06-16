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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        Map<Integer, Boolean> hashmap = new HashMap<>();
        while (head.next != null){
            if (hashmap.get(head.val) != null){
                return true;
            } else {
                hashmap.put(head.val, true);
            }
            head = head.next;
        }
        return false;
    }
}
