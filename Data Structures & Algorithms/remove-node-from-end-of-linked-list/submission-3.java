
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1 2 3 4 5 6
        // n = 3


        // first = 1
        // second = 1;
        // second++
        // second++
        // second++;
        // second = 4
        // second = 5
        // first = 2
        // second = 6
        // first = 3
        // seond -> next = null
        // first -> next = first -> next -> next
        // first = 4-> next = 5
        // 1 2 3 5 6

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
            System.out.println("First val: " + first.val);
        }
        System.out.println("First val: " + first.val);
        System.out.println("Diff: " + diff);
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
