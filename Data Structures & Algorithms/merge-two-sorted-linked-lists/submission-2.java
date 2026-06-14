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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode current = merged;
        if (list1 == null && list2 == null){
            return merged = null;
        }
        else if (list1 == null){
            return merged = list2;
        } else if (list2 == null){
            return merged = list1;
        } 
        // Listnode nextNode = new ListNode;
        if (list1.val <= list2.val){
            merged = list1;
            current = list1;
            System.out.println("List 1 as starting: " + list1.val);
            // ListNode nextNode = list1;
            list1 = list1.next;
            // current.next = nextNode;
            // current = nextNode;
        } else {
            ListNode nextNode = list2;
            merged = list2;
            current = list2;
            list2 = list2.next;
            // System.out.println("List 2 as starting: " + list2.val);
            // current.next = nextNode;
            // current = nextNode;
        }
        while(list1 != null && list2 != null){
            System.out.println("List 1: " + list1.val + "List 2: " + list2.val);
            if (list2.val > list1.val){
                System.out.println("Adding list 1: " + list1.val);
                ListNode nextNode = list1;
                current.next = nextNode;
                current = nextNode;
                list1 = list1.next;
            } else {
                System.out.println("Adding list 2: " + list2.val);
                ListNode nextNode = list2;
                current.next = nextNode;
                current = current.next;
                list2 = list2.next;
            }
        }

        if (list1 == null){
            current.next = list2;
        } else {
            current.next = list1;
        }
        return merged;
    }
}