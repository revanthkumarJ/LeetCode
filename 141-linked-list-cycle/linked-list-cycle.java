
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
        return false;
        ListNode temp=head;
        ListNode next=temp.next;
        while(temp!=null && next!=null)
        {
            if(temp==next)
            return true;
            temp=temp.next;
            if(next.next==null)
            return false;
            next=next.next.next;
        }
        return false;
    }
}