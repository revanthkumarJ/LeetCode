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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode temp=l1;
        ListNode prev=null;
        int count=0;
        while(temp!=null && l2!=null)
        {
            int m=temp.val+l2.val+count;
            temp.val=m%10;
            count=m/10;
            prev=temp;
            temp=temp.next;
            l2=l2.next;
        }
        if(temp==null)
        {
            prev.next=l2;
            temp=l2;
        }
        while(temp!=null)
        {
            int m=temp.val+count;
            temp.val=m%10;
            count=m/10;
            if(count==0)break;
            prev=temp;
            temp=temp.next;
        }
        if(count!=0)
        {
            ListNode n=new ListNode(count);
            prev.next=n;
        }
        return l1;
        
        
    }
}