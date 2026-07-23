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
        ListNode head = new ListNode();
        ListNode now = head;
        int carry  = 0;
        int sum = l1.val + l2.val + carry;
        carry = 0;
        if (sum > 9){
            now.val = sum % 10;
            carry = 1;
        } else {
            now.val = sum;
        }
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null){
            ListNode next = new ListNode();
            sum = l1.val + l2.val + carry;
            carry = 0;
            if (sum > 9){
                next.val = sum % 10;
                System.out.println(head.val);
                carry = 1;
            } else {
                next.val = sum;
                carry=0;
            }
            l1 = l1.next;
            l2 = l2.next;
            now.next = next;
            now = next;
        }
        if (l1 != null){
            System.out.println("Entering loop 1");
            while (l1 != null){
                ListNode next = new ListNode();
                sum = l1.val + carry;
                if (sum > 9){
                next.val = sum % 10;
                carry = 1;
            } else {
                next.val = sum;
                carry=0;
            }
            l1 = l1.next;
            now.next = next;
            now = next;
            }
        } else if (l2 != null){
            System.out.println("Entering loop 2");
            while (l2 != null){
                ListNode next = new ListNode();
                sum = l2.val + carry;
                if (sum > 9){
                next.val = sum % 10;
                carry = 1;
            } else {
                next.val = sum;
                carry=0;
            }
            l2 = l2.next;
            now.next = next;
            now = next;
            }
        }
        if (carry==1){
                now.next = new ListNode();
                now.next.val = 1;
                System.out.println(head.val);
            }

        return head;
    }
}
