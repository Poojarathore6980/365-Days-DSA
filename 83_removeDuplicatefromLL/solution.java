class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // duplicate found → skip next node
                current.next = current.next.next;
            } else {
                // move forward only when no duplicate
                current = current.next;
            }
        }

        return head;
    }
}