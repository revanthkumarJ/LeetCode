import java.math.BigInteger;
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
    public ListNode doubleIt(ListNode head) {
        if(head==null)
        return null;
        String s="";
        while(head!=null)
        {
            s=s+head.val;
            head=head.next;
        }
        BigInteger a=new BigInteger(s);
        a=a.add(a);
        s=a.toString();
        head=new ListNode(Integer.parseInt(s.charAt(0)+""));
        ListNode temp=head;
        for(int i=1;i<s.length();i++)
        {
            ListNode node=new ListNode(Integer.parseInt(s.charAt(i)+""));
            temp.next=node;
            temp=node;
        }
        temp.next=null;
        return head;
    }
}