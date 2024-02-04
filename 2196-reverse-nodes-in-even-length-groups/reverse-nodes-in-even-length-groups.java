/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(ListNode head)
    {
        ListNode pre=null;
        ListNode curr=head;
        ListNode post;
        while(curr!=null)
        {
            post=curr.next;
            curr.next=pre;
            pre=curr;
            curr=post;
        }
        return pre;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null)
        return null;
        int i=1;
        ListNode start=head.next;
        ListNode temp=head;
        ListNode prev=head;
        ListNode last=head;
        while(temp!=null)
        {
            int ind=1;
            for(ind=1;ind<i;ind++)
            {
                
                temp=temp.next;
                if(temp==null)
                break;
                
            }
            if(ind%2==0)
            {
                if(temp==null){
                    prev.next=rev(start);
                }
                else{
                last=temp.next;
                temp.next=null;
                ListNode newHead=rev(start);
                prev.next=newHead;
                start.next=last;
                prev=start;
                start=last;
                temp=start;
                }
            }
            else if(temp!=null)
            {
                prev=temp;
                start=temp.next;
                temp=temp.next;
            }
            i++;
        }
        return head;


    }
}