class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;
        if(n==1 && head.next==null)
        return null;
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        size=size-n;
        temp=head;
        ListNode pre=null;
        n=0;
        while(n<size)
        {
            n++;
            pre=temp;
            temp=temp.next;
        }
        if(temp==head)
        head=head.next;
        else
        {
            if(temp!=null && temp.next!=null)
            pre.next=temp.next;
            else 
            pre.next=null;
        }
        return head;


    }
}