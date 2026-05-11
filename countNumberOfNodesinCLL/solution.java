class Solution {
    public int countNodes(Node head) {
        // Case 1: empty list
        if (head == null) return 0;

        int count = 1;
        Node curr = head;

        // Traverse till we come back to head
        while (curr.next != head) {
            count++;
            curr = curr.next;
        }

        return count;
    }
}