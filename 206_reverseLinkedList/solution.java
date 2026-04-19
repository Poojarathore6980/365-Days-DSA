class Solution {
    public ListNode reverseList(ListNode head) {
        

    ListNode prev = null;     // Step 0
    ListNode curr = head;

    while (curr != null) {

        // MICRO STEP A: Save next
        ListNode next = curr.next;

        // MICRO STEP B: Reverse pointer
        curr.next = prev;

        // MICRO STEP C: Move prev
        prev = curr;

        // MICRO STEP D: Move curr
        curr = next;
    }

    return prev;   // new head
}

        
    }
