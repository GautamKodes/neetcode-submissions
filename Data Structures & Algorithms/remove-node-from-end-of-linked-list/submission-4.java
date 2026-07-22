
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        int diff=0;
        int i = 1;
        while (i<=n && second.next != null){
            second = second.next;
            diff++;
            i++;
        }

        while (second != null && second.next != null){
            second = second.next;
            first = first.next;
        }
        if (first == head){
            if ( n - diff == 1){
                head = head.next;
                return head;
            }
            if (head.next != null){
                head.next = head.next.next;
                return head;
            } else {
                return null;
            }
        } else {
            first.next = first.next.next;
            return head;
        }
    }
}
