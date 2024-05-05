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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] array=new ListNode[k];
        int n=0;
        ListNode h=head;
        while(h!=null)
        {
            n++;
            h=h.next;
        }
        if(n<=k)
        {
            ListNode pre=head;
            for(int i=0;i<n;i++)
            {
                array[i]=head;
                pre=head;
                head=head.next;
                pre.next=null;
            }
            return array;
        }
        int each=n/k;
        int rem=n%k;
        for(int i=0;i<k;i++)
        {
            array[i]=head;
            ListNode pre=head;
            for(int j=1;j<=each;j++)
            {
                pre=head;
                head=head.next;
            }
            if(rem>0)
            {
                pre=head;
                head=head.next;
                rem--;
            }
            pre.next=null;
        }

        return array;

    }
}