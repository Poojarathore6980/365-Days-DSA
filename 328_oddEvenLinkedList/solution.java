class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Edge cases
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;          // starts at position 1
        ListNode even = head.next;    // starts at position 2
        ListNode evenHead = even;     // store start of even list

        // Rearranging nodes
        while (even != null && even.next != null) {
            odd.next = even.next;     // link odd to next odd
            odd = odd.next;

            even.next = odd.next;     // link even to next even
            even = even.next;
        }

        // Attach even list at the end of odd list
        odd.next = evenHead;

        return head;
    }
}