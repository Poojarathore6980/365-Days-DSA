class Solution {
    static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return false;
        
        // finding middle by fast and slow pointer
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode secondHalf=reverse(slow);
        ListNode temp1=head;
        ListNode temp2=secondHalf;
        while(temp2!=null){
            if(temp1.val!=temp2.val) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
        
    }
}