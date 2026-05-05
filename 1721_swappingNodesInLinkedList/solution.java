class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        
        // Step 1: Move to k-th node from start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        // Step 2: Find k-th node from end
        ListNode fast = first;
        ListNode second = head;
        
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }
        
        // Step 3: Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}